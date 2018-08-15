package zpe.jiakeyi.com.zhanpaieaw.adapter;

import android.content.Context;

import com.kongzue.baseframework.interfaces.MultipleAdapterSettings;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/10.
 * 区适配器
 */

public class DistrictListAdapter extends com.kongzue.baseframework.BaseAdapter {
    public DistrictListAdapter(Context context, List<? extends BaseDataBean> datas, Map<Integer, Integer> layoutResId, MultipleAdapterSettings multipleAdapterSettings) {
        super(context, datas, layoutResId, multipleAdapterSettings);
    }
}
