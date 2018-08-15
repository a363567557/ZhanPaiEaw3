package zpe.jiakeyi.com.zhanpaieaw.fragment.my;


import android.annotation.SuppressLint;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;

import java.util.ArrayList;
import java.util.List;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyCollectFragmentAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
@Layout(R.layout.fragment_blank_fragment2)
public class CollectBoothFragment extends BaseFragment {
    private int count;
    private TabLayout fragment_tab;
    private ViewPager fragment_viewpager;
    private List<Fragment> data;
    private List<String> lists;
    private MyCollectFragmentAdapter myFragmentAdapter;

    public CollectBoothFragment(int count) {
        this.count = count;
    }

    @Override
    public void initViews() {
        fragment_tab = findViewById(R.id.fragment_tab);
        fragment_viewpager = findViewById(R.id.fragment_viewpager);
        lists = new ArrayList<>();
        data = new ArrayList<>();
    }

    @Override
    public void initDatas() {
        lists.add("未解决");
        lists.add("已解决");
        lists.add("已解决");
        lists.add("已解决");
        lists.add("已解决");
        lists.add("已解决");
        lists.add("已解决");
        lists.add("已解决");
        data.add(new ExhibitsFragment(count, 0));
        data.add(new ExhibitsFragment(count, 1));
        data.add(new ExhibitsFragment(count, 2));
        data.add(new ExhibitsFragment(count, 3));
        data.add(new ExhibitsFragment(count, 4));
        data.add(new ExhibitsFragment(count, 5));
        data.add(new ExhibitsFragment(count, 6));
        data.add(new ExhibitsFragment(count, 7));

        myFragmentAdapter = new MyCollectFragmentAdapter(getChildFragmentManager(), data, lists);

        fragment_viewpager.setAdapter(myFragmentAdapter);
        // 将ViewPager与TabLayout相关联
        fragment_tab.setupWithViewPager(fragment_viewpager);
    }

    @Override
    public void setEvents() {

    }

}
