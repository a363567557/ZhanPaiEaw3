package zpe.jiakeyi.com.zhanpaieaw.fragment.my;


import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
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
@Layout(R.layout.fragment_blank)
public class DownloadFragment extends BaseFragment {
    private RecyclerView relativeLayout;
    private MyCollectAdapter my2Adapter;
    public int count;

    @SuppressLint("ValidFragment")
    public DownloadFragment(int count) {
        this.count = count;
    }

    public DownloadFragment() {
    }

    @Override
    public void initViews() {
        toast("第" + count);
        relativeLayout = findViewById(R.id.relativeLayout);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(me);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        relativeLayout.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void initDatas() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }
        if (count == 0) {
            my2Adapter = new MyCollectAdapter(R.layout.item_jiejue_adapter, list);
        } else {
            my2Adapter = new MyCollectAdapter(R.layout.item_jiejue_adapter2, list);
        }
        relativeLayout.setAdapter(my2Adapter);
    }

    @Override
    public void setEvents() {

    }

}
