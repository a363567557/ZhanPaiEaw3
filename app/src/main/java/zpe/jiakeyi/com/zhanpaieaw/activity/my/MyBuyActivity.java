package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;

import java.util.ArrayList;
import java.util.List;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyCollectAdapter;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyCollectAdapter2;
import zpe.jiakeyi.com.zhanpaieaw.fragment.my.CollectBoothFragment;
import zpe.jiakeyi.com.zhanpaieaw.view.NoSrcollViewPage;

/**
 * @author Gjianfu
 * @date 2018/8/13
 * 功能描述:我的求购
 */
@Layout(R.layout.activity_main3)
@DarkStatusBarTheme(true)
public class MyBuyActivity extends BaseActivity {
    private TabLayout tablayout_xiaoxi;
    private NoSrcollViewPage viewpager;
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
        lists.add("解决");
        lists.add("未解决");
        data.add(new CollectBoothFragment(0));
        data.add(new CollectBoothFragment(1));
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
