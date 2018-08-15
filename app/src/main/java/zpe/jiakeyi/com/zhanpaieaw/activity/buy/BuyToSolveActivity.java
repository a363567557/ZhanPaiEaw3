package zpe.jiakeyi.com.zhanpaieaw.activity.buy;


import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;

import java.util.ArrayList;
import java.util.List;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyCollectAdapter2;
import zpe.jiakeyi.com.zhanpaieaw.fragment.my.DownloadFragment;

@Layout(R.layout.activity_main2)
@DarkStatusBarTheme(false)           //开启顶部状态栏图标、文字暗色模式
@DarkNavigationBarTheme(true)       //开启底部导航栏按钮暗色模式
@NavigationBarBackgroundColor(a = 0, r = 0, g = 0, b = 0)
public class  BuyToSolveActivity extends BaseActivity {

    private TabLayout tablayout_xiaoxi;
    private ViewPager viewpager;
    private List<Fragment> data;
    private List<String> lists;

    @Override
    public void initViews() {
        tablayout_xiaoxi = findViewById(R.id.tablayout_xiaoxi);
        viewpager = findViewById(R.id.viewpager);
        lists = new ArrayList<>();
        data = new ArrayList<>();
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        lists.add("未解决");
        lists.add("已解决");
        data.add(new DownloadFragment(0));
        data.add(new DownloadFragment(1));
        MyCollectAdapter2 myAdaptre = new MyCollectAdapter2(me.getSupportFragmentManager(),data,lists);
        viewpager.setAdapter(myAdaptre);
        viewpager.setCurrentItem(0);

        tablayout_xiaoxi.addTab(tablayout_xiaoxi.newTab().setText(lists.get(0)));
        tablayout_xiaoxi.addTab(tablayout_xiaoxi.newTab().setText(lists.get(1)));
        tablayout_xiaoxi.setTabTextColors(Color.GRAY,Color.rgb(140,211,236));//变颜色
        tablayout_xiaoxi.setupWithViewPager(viewpager);//把tablayout和viewpage绑定在一起
    }

    @Override
    public void setEvents() {

    }

}
