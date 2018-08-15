package zpe.jiakeyi.com.zhanpaieaw.adapter;

import android.content.Context;

import com.kongzue.baseframework.BaseAdapter;
import com.kongzue.baseframework.interfaces.MultipleAdapterSettings;
import com.kongzue.baseframework.interfaces.SimpleAdapterSettings;
import com.kongzue.baseframework.interfaces.SimpleMapAdapterSettings;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/8/10.
 * 省适配器
 */

public class ProvinceListAdapter extends BaseAdapter {
    public ProvinceListAdapter(Context context, List<? extends BaseDataBean> datas, int layoutResId, SimpleAdapterSettings multipleAdapterSettings) {
        super(context, datas, layoutResId, multipleAdapterSettings);
    }
}
