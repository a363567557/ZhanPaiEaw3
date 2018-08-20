package zpe.jiakeyi.com.zhanpaieaw.activity.buy;

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
 * 创建人： 九尾妖狐
 * 创建时间： 2018/1/18 9:32
 * 功能描述：求购详情
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */
@Layout(R.layout.activity_particulars)
@DarkStatusBarTheme(true) //开启顶部状态栏图标、文字暗色模式
public class ParticularsActivity extends BaseActivity {
    private ImageView image_finish;
    private TextView particuars_tv_relation;
    private WebView webView;

    @Override
    public void initViews() {
        image_finish = findViewById(R.id.image_finish);
        particuars_tv_relation = findViewById(R.id.particuars_tv_relation);
        webView = findViewById(R.id.web_news_particulars);
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        webView.loadUrl("https://www.jd.com/?cu=true&utm_source=sogou-pinzhuan&utm_medium=cpc&utm_campaign=t_288551095_sogoupinzhuan&utm_term=72c3e74a359c48598c6fabe6c1169112_0_254d6a4d365a4c79b7d0e706f55ea6cc");
    }

    @Override
    public void setEvents() {
        image_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        particuars_tv_relation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //弹出一个对话框
            }
        });
    }

}
