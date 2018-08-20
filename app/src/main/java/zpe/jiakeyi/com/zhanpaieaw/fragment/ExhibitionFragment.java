package zpe.jiakeyi.com.zhanpaieaw.fragment;


import com.kongzue.baseframework.BaseFragment;
import com.kongzue.baseframework.interfaces.Layout;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.activity.exhibition.ExhibitionActivity;

/**
 * 创建人： 郭健福
 * 创建时间： 2018/7/23 21:44
 * 功能描述：3D展厅
 *
 * @author dell-pc
 */
@Layout(R.layout.fragment_exhibition)
public class ExhibitionFragment extends BaseFragment {


    public ExhibitionFragment() {
        // Required empty public constructor
    }


    @Override
    public void initViews() {

    }

    @Override
    public void initDatas() {

    }

    @Override
    public void setEvents() {

    }

    @Override
    public void onStart() {
        super.onStart();
        jump(ExhibitionActivity.class);
        ExhibitionActivity.IntentAll();
    }
}
