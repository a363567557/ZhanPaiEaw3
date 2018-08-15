package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.view.View;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;
import com.zhy.autolayout.AutoLinearLayout;

import zpe.jiakeyi.com.zhanpaieaw.R;
/**
 * 创建人： 九尾妖狐
 * 创建时间： 2018/8/6 10:00
 * 功能描述： 帮助界面
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */

@Layout(R.layout.activity_hellp)
@DarkStatusBarTheme(false) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255, r = 255, g = 255, b = 255)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的)
@DarkNavigationBarTheme(false) //开启底部导航栏按钮暗色模式
public class HellpActivity extends BaseActivity {
    private AutoLinearLayout hellp_atll_booth;
//    private AutoLinearLayout hellp_atll_booth;
//    private AutoLinearLayout hellp_atll_booth;
//    private AutoLinearLayout hellp_atll_booth;

    @Override
    public void initViews() {
        hellp_atll_booth = findViewById(R.id.hellp_atll_booth);

    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        hellp_atll_booth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(HellpBoothActivity.class);
            }
        });
    }
}
