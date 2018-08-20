package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.view.View;
import android.widget.ImageView;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;

import zpe.jiakeyi.com.zhanpaieaw.R;


/**
 * @author Gjianfu
 * @date 2018/8/13
 * 功能描述:用户名
 */
@Layout(R.layout.activity_user_name)
@DarkStatusBarTheme(true)
public class UserNameActivity extends BaseActivity {
    private ImageView image_finish;

    @Override
    public void initViews() {
        image_finish = findViewById(R.id.image_finish);
    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        image_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
