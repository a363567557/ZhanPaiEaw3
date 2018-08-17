package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyCollectAdapter2;
import zpe.jiakeyi.com.zhanpaieaw.fragment.my.CollectBoothFragment;
import zpe.jiakeyi.com.zhanpaieaw.fragment.my.MyCollectFragment;

@Layout(R.layout.activity_buy_buy)
@DarkStatusBarTheme(false) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255, r = 255, g = 255, b = 255)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的)
@DarkNavigationBarTheme(false) //开启底部导航栏按钮暗色模式
public class BuyBuyActivity extends BaseActivity {

    private TabLayout tablayout_xiaoxi;
    private ViewPager viewpager;
    private List<Fragment> data;
    private List<String> lists;

    @Override
    public void initViews() {
        tablayout_xiaoxi = findViewById(R.id.tablayout_xiaoxi1);
        viewpager = findViewById(R.id.viewpager1);
        lists = new ArrayList<>();
        data = new ArrayList<>();
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        lists.add("产品");
        lists.add("展位");
        data.add(new MyCollectFragment(2));
        data.add(new MyCollectFragment(3));
        MyCollectAdapter2 myAdaptre = new MyCollectAdapter2(me.getSupportFragmentManager(), data, lists);
        viewpager.setAdapter(myAdaptre);
        viewpager.setCurrentItem(0);
        tablayout_xiaoxi.addTab(tablayout_xiaoxi.newTab().setText(lists.get(0)));
        tablayout_xiaoxi.addTab(tablayout_xiaoxi.newTab().setText(lists.get(1)));
        tablayout_xiaoxi.setTabTextColors(Color.GRAY, Color.rgb(140, 211, 236));//变颜色
        tablayout_xiaoxi.setupWithViewPager(viewpager);//把tablayout和viewpage绑定在一起
    }

    @Override
    public void setEvents() {

    }

}
