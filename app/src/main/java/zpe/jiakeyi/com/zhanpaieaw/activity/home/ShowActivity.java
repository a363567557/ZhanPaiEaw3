package zpe.jiakeyi.com.zhanpaieaw.activity.home;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.flexbox.FlexboxLayout;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import chihane.jdaddressselector.AddressSelector;
import chihane.jdaddressselector.BottomDialog;
import chihane.jdaddressselector.OnAddressSelectedListener;
import chihane.jdaddressselector.model.City;
import chihane.jdaddressselector.model.County;
import chihane.jdaddressselector.model.Province;
import chihane.jdaddressselector.model.Street;
import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyPopuWindowAdapter;
import zpe.jiakeyi.com.zhanpaieaw.adapter.ShowRecyclerAdapter;
import zpe.jiakeyi.com.zhanpaieaw.bean.ShowTypeBean;
import zpe.jiakeyi.com.zhanpaieaw.bean.TextBean;
import zpe.jiakeyi.com.zhanpaieaw.utils.HttpUtlis;
import zpe.jiakeyi.com.zhanpaieaw.view.DividerGridItemDecoration;

/**
 * 创建人： 郭健福
 * 创建时间： 2018/7/23 21:44
 * 功能描述：商品展示页
 *
 * @author dell-pc
 */
@Layout(R.layout.activity_show)
@DarkStatusBarTheme(false) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255, r = 255, g = 255, b = 255)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的)
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色模式
public class ShowActivity extends BaseActivity {

    private ImageView return_img_seek;
    private XRecyclerView recycle_show_home;
    private ShowRecyclerAdapter showRecyclerAdapter;
    private List<TextBean> strings;
    private AutoLinearLayout show_zonghe;
    private AutoLinearLayout seek_title;
    private AutoLinearLayout address_show;
    /**
     * PoupWindow 中的列表
     */
    private PopupWindow dealWindow;
    private RecyclerView popuwindow_deal_rv;
    /**
     * popupWindow 的视图
     */
    private View contentView;
    /**
     * popupWindow 的数据
     * 这里会创建一个实体类
     */
    private List<ShowTypeBean> listshow;
    private List<ShowTypeBean> listjyms;

    //创建适配器
    private MyPopuWindowAdapter myPopuWindowAdapter;
    private FlexboxLayout flexbox_layout_show;
    private AutoLinearLayout jyms_show;
    private AutoLinearLayout classify_title;
    private AutoLinearLayout seek_title_layout;

    @Override
    public void initViews() {
//        HttpUtlis.registerDate_Screening("10","0","","","","","","");
        return_img_seek = findViewById(R.id.return_img_seek);
        classify_title = findViewById(R.id.classify_title);
        seek_title_layout = findViewById(R.id.seek_title_layout);
        recycle_show_home = findViewById(R.id.recycle_show_home);
        recycle_show_home.setLayoutManager(new GridLayoutManager(me, 2, OrientationHelper.VERTICAL, false));
        showRecyclerAdapter = new ShowRecyclerAdapter(me);
        recycle_show_home.addItemDecoration(new DividerGridItemDecoration(this));
        recycle_show_home.setAdapter(showRecyclerAdapter);
        show_zonghe = findViewById(R.id.show_zonghe);
        address_show = findViewById(R.id.address_show);
        flexbox_layout_show = findViewById(R.id.flexbox_layout_show);
        seek_title = findViewById(R.id.seek_title);
        jyms_show = findViewById(R.id.jyms_show);
        listshow = new ArrayList<>();
        listjyms = new ArrayList<>();
        strings = new ArrayList<>();
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void initDatas(JumpParameter paramer) {
        if (paramer != null) {
            boolean o = (boolean) paramer.get("是否显示分类栏");
            if (o) {
                classify_title.setVisibility(View.VISIBLE);
                seek_title_layout.setVisibility(View.VISIBLE);
            } else {
                classify_title.setVisibility(View.GONE);

            }
        }

        strings.add(new TextBean().setTitle("1"));
        strings.add(new TextBean().setTitle("1"));
        strings.add(new TextBean().setTitle("1"));
        strings.add(new TextBean().setTitle("1"));
        listshow.add(new ShowTypeBean("全部类型", true));
        listshow.add(new ShowTypeBean("人气", false));
        listjyms.add(new ShowTypeBean("生产商", true));
        listjyms.add(new ShowTypeBean("代理商", false));
        listjyms.add(new ShowTypeBean("个人用户", false));
        addHotTextItem("标签1");
        addHotTextItem("标签22");
        addHotTextItem("标签333");
        addHotTextItem("标签4444");
        addHotTextItem("标签55555");
        addHotTextItem("标签666666");
    }

    @Override
    protected void onStop() {
        super.onStop();
        classify_title.setVisibility(View.GONE);
        fileList();
    }

    @Override
    public void setEvents() {
        return_img_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        jyms_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poPuWindow(listjyms);
                if (!dealWindow.isShowing()) {
                    dealWindow.showAsDropDown(v, 0, 0);
                } else {
                    dealWindow.dismiss(

                    );
                }
            }
        });
        show_zonghe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击弹出popupwindow
                poPuWindow(listshow);
                if (!dealWindow.isShowing()) {
                    dealWindow.showAsDropDown(v, 0, 0);
                } else {
                    dealWindow.dismiss(

                    );
                }
            }
        });
        seek_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(SeekActivity.class);
            }
        });
        address_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddressSelector selector = new AddressSelector(me);
                selector.setOnAddressSelectedListener(new OnAddressSelectedListener() {
                    @Override
                    public void onAddressSelected(Province province, City city, County county, Street street) {

                    }
                });

                View view = selector.getView();
                BottomDialog dialog = new BottomDialog(me);
                dialog.setOnAddressSelectedListener(new OnAddressSelectedListener() {
                    @Override
                    public void onAddressSelected(Province province, City city, County county, Street street) {

                    }
                });
                dialog.show();
            }
        });
    }


    private void poPuWindow(final List<ShowTypeBean> list) {
        //popuwindow实例化
        contentView = LayoutInflater.from(me).inflate(R.layout.popuwindow_deal_layout, null, false);
        popuwindow_deal_rv = contentView.findViewById(R.id.popuwindow_deal_rv);
        //创建布局管理
        LinearLayoutManager layoutManager = new LinearLayoutManager(me);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        popuwindow_deal_rv.setLayoutManager(layoutManager);

        //创建适配器
        myPopuWindowAdapter = new MyPopuWindowAdapter(R.layout.item_popuwindow_dapter, list);
        //给RecyclerView设置适配器
        popuwindow_deal_rv.setAdapter(myPopuWindowAdapter);
        //item点击事件
        myPopuWindowAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                toast("你点击了" + list.get(position).toString());
                for (ShowTypeBean mList : list) {
                    mList.judge = false;
                }
                list.get(position).judge = true;
                myPopuWindowAdapter.notifyDataSetChanged();
                dealWindow.dismiss();
            }
        });


        /**
         * 创建PopupWindow对象，其中：
         *第一个参数是用于PopupWindow中的View，第二个参数是PopupWindow的宽度，
         * 第三个参数是PopupWindow的高度，第四个参数指定PopupWindow能否获得焦点
         * */
        dealWindow = new PopupWindow(contentView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT, true);
        // 设置PopupWindow的背景
        dealWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //点击popupWindow外是否响应
        dealWindow.setFocusable(false);
        // 设置PopupWindow是否能响应外部点击事件
        dealWindow.setOutsideTouchable(true);
        // 设置PopupWindow是否能响应点击事件
        dealWindow.setTouchable(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("ResourceAsColor")
    private void addHotTextItem(String s) {
        // 通过代码向FlexboxLayout添加View
        TextView textView = new TextView(this);
        textView.setBackground(getResources().getDrawable(R.drawable.shape_corner_seek));
        textView.setLayoutParams(new FlexboxLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(10, 10, 10, 10);//4个参数按顺序分别是左上右下
        textView.setLayoutParams(layoutParams);
        textView.setText(s);
        textView.setTextSize(18);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(30, 0, 30, 0);
        textView.setTextColor(R.color.seekColorText);
        flexbox_layout_show.addView(textView);
    }

}
