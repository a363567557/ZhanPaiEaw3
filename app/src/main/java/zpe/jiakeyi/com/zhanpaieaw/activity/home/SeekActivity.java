package zpe.jiakeyi.com.zhanpaieaw.activity.home;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;
import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;

import zpe.jiakeyi.com.zhanpaieaw.R;

/**
 * 创建人： 郭健福
 * 创建时间： 2018/7/23 21:44
 * 功能描述：搜索页
 * @author dell-pc
 */
@Layout(R.layout.activity_seek)
@DarkStatusBarTheme(false) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255, r = 255, g = 255, b = 255)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的)
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色模式
public class SeekActivity extends BaseActivity {

    private ImageView return_img_seek;
    private FlexboxLayout flexbox_layout;
    private FlexboxLayout flexbox_layout_hot;
    private FlexboxLayout flexbox_layout_history;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void initViews() {
        return_img_seek = (ImageView) findViewById(R.id.return_img_seek);
        flexbox_layout_hot = (FlexboxLayout) findViewById(R.id.flexbox_layout_hot);
        flexbox_layout_history = (FlexboxLayout) findViewById(R.id.flexbox_layout_history);

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("ResourceAsColor")
    private void addHistoryTextItem(String s) {
        // 通过代码向FlexboxLayout添加View0
        TextView textView = new TextView(this);
        textView.setBackground(getResources().getDrawable(R.drawable.shape_corner_seek));
        textView.setLayoutParams(new FlexboxLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(10, 0, 10, 10);//4个参数按顺序分别是左上右下
        textView.setLayoutParams(layoutParams);
        textView.setText(s);
        textView.setTextSize(18);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(30, 0, 30, 0);
        textView.setTextColor(R.color.seekColorText);
        flexbox_layout_history.addView(textView);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void initDatas(JumpParameter paramer) {
        addHotTextItem("标签1");
        addHotTextItem("标签22");
        addHotTextItem("标签333");
        addHotTextItem("标签4444");
        addHotTextItem("标签55555");
        addHotTextItem("标签666666");
        addHistoryTextItem("标签1");
        addHistoryTextItem("标签22");
        addHistoryTextItem("标签333");
        addHistoryTextItem("标签4444");
        addHistoryTextItem("标签55555");
        addHistoryTextItem("标签666666");
    }

    @Override
    public void setEvents() {

    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("ResourceAsColor")
    private void addHotTextItem(String s) {
        // 通过代码向FlexboxLayout添加View
        TextView textView = new TextView(this);
        textView.setBackground(getResources().getDrawable(R.drawable.shape_corner_seek));
        textView.setLayoutParams(new FlexboxLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(10, 10, 10, 10);//4个参数按顺序分别是左上右下
        textView.setLayoutParams(layoutParams);
        textView.setText(s);
        textView.setTextSize(18);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(30, 0, 30, 0);
        textView.setTextColor(R.color.seekColorText);
        flexbox_layout_hot.addView(textView);
    }

}
