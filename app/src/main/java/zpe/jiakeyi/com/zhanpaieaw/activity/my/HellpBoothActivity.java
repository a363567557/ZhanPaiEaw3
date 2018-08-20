package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.view.View;
import android.widget.ImageView;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;

import zpe.jiakeyi.com.zhanpaieaw.R;
/**
 *
 * @author Gjianfu
 * @date 2018/8/13
 * 功能描述:
 */
@Layout(R.layout.activity_hellp_booth)
@DarkStatusBarTheme(true)
public class HellpBoothActivity extends BaseActivity {
    private ImageView title_back;

    @Override
    public void initViews() {
        title_back = findViewById(R.id.title_back);

    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        title_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
