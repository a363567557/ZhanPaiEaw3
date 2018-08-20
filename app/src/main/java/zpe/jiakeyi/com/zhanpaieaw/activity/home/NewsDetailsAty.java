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
@DarkStatusBarTheme(true) //开启顶部状态栏图标、文字暗色模式
public class NewsDetailsAty extends BaseActivity {


    private ImageView title_back;
    private TextView title_name;
    private ImageView title_seek;
    private WebView web_news_details;

    @Override
    public void initViews() {
        title_back = findViewById(R.id.title_back);
        title_name = findViewById(R.id.title_name);
        title_seek = findViewById(R.id.title_seek);
        web_news_details = findViewById(R.id.web_news_details);
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        web_news_details.loadUrl("http://m.baidu.com/?cip=117.136.54.19&amp;baiduid=B02FA207E9F6316421974343BBAC55C0&amp;from=844b&amp;vit=fps?from=844b&amp;vit=fps&amp;index=&amp;ssid=0&amp;bd_page_type=1&amp;logid=7938441944509756072&pu=sz%401321_480&t_noscript=jump");
    }

    @Override
    public void setEvents() {
        title_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        title_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(SeekActivity.class);
            }
        });

    }

}
