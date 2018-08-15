package zpe.jiakeyi.com.zhanpaieaw.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import zpe.jiakeyi.com.zhanpaieaw.R;

/**
 * 创建人： 郭健福
 * 创建时间： 2018/7/23 21:44
 * 功能描述：首页中实验室器材分类页面的RecyclerView的适配器
 * @author dell-pc
 */

public class ShowRecyclerAdapter extends RecyclerView.Adapter<ShowRecyclerAdapter.MyViewHolder> {
    private Context mContext;
    private MyViewHolder myViewHolder;

    public ShowRecyclerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_show_home_item, null);
        myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_show_recycle_item;
        TextView tv_show_recycle_item_name;
        TextView tv_show_recycle_item_city;
        TextView tv_show_recycle_item_region;
        TextView tv_show_recycle_look;

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
