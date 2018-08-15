package zpe.jiakeyi.com.zhanpaieaw.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by dell-pc on 2018/8/11.
 */

public class MyCollectAdapter2 extends FragmentPagerAdapter {
    private List<Fragment> data;
    private List<String> title;

    public MyCollectAdapter2(FragmentManager fm, List<Fragment> data, List<String> title) {
        super(fm);
        this.data = data;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }
    @Override
    public int getCount() {
        return data.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
