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
 * @author Gjianfu
 * @date 2018/8/17
 * 功能描述:
 */

@Layout(R.layout.activity_hellp)
@DarkStatusBarTheme(true)
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
