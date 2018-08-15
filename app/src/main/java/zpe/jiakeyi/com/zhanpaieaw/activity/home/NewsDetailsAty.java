package zpe.jiakeyi.com.zhanpaieaw.activity.home;


import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;

import zpe.jiakeyi.com.zhanpaieaw.R;

/**
 * @author Gjianfu
 * @date 2018/7/24
 * 功能描述:新闻详情页用于加载web
 */
@Layout(R.layout.activity_news_details_aty)
@DarkStatusBarTheme(false) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255, r = 255, g = 255, b = 255)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的)
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色模式
public class NewsDetailsAty extends BaseActivity implements View.OnClickListener {


    private ImageView title_back;
    private TextView title_name;
    private ImageView title_seek;
    private WebView web_news_details;

    @Override
    public void initViews() {
        title_back = findViewById(R.id.title_back);
        title_back.setOnClickListener(this);
        title_name = findViewById(R.id.title_name);
        title_name.setOnClickListener(this);
        title_seek = findViewById(R.id.title_seek);
        title_seek.setOnClickListener(this);
        web_news_details = findViewById(R.id.web_news_details);
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        web_news_details.loadUrl("http://m.baidu.com/?cip=117.136.54.19&amp;baiduid=B02FA207E9F6316421974343BBAC55C0&amp;from=844b&amp;vit=fps?from=844b&amp;vit=fps&amp;index=&amp;ssid=0&amp;bd_page_type=1&amp;logid=7938441944509756072&pu=sz%401321_480&t_noscript=jump");
    }

    @Override
    public void setEvents() {

    }

    @Override
    public void onClick(View v) {

    }
}
