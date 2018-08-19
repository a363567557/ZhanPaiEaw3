package zpe.jiakeyi.com.zhanpaieaw.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import zpe.jiakeyi.com.zhanpaieaw.R;

/**
 * Created by dell-pc on 2018/8/20.
 */

public class ReleaseAdapter extends BaseQuickAdapter<String,BaseViewHolder>{
    public ReleaseAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.item_dialog_text,item);
    }
}
