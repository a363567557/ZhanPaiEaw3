package zpe.jiakeyi.com.zhanpaieaw.fragment.my;


import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;

import java.util.ArrayList;
import java.util.List;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyCollectAdapter;
import zpe.jiakeyi.com.zhanpaieaw.adapter.MyCollectAdapter2;


/**
 * A simple {@link Fragment} subclass.
 *
 * @author dell-pc
 */
@SuppressLint("ValidFragment")
@Layout(R.layout.fragment_blank_fragment3)
public class ExhibitsFragment extends BaseFragment {
    private int count1, count2;
    private RecyclerView fgt_recyclcerview;
    private MyCollectAdapter my2Adapter;

    public ExhibitsFragment(int count1, int count2) {
        this.count1 = count1;
        this.count2 = count2;
    }

    @Override
    public void initViews() {
        fgt_recyclcerview = findViewById(R.id.fgt_recyclcerview);

    }

    @Override
    public void initDatas() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }
        if (count1 == 0) {
            fgt_recyclcerview.setLayoutManager(new GridLayoutManager(me, 2, OrientationHelper.VERTICAL, false));
            my2Adapter = new MyCollectAdapter(R.layout.recycler_show_home_item, list);
        } else if (count1 == 1) {
            fgt_recyclcerview.setLayoutManager(new GridLayoutManager(me, 1, OrientationHelper.VERTICAL, false));
            my2Adapter = new MyCollectAdapter(R.layout.item_jiejue_adapter, list);
        }
        fgt_recyclcerview.setAdapter(my2Adapter);
    }

    @Override
    public void setEvents() {

    }

}
