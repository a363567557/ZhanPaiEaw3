package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;

import zpe.jiakeyi.com.zhanpaieaw.R;


@Layout(R.layout.activity_password)
@DarkStatusBarTheme(true)
public class PasswordActivity extends BaseActivity {

    private ImageView image_finish;
    private EditText user_name;

    @Override
    public void initViews() {
        image_finish = findViewById(R.id.image_finish);
        user_name = findViewById(R.id.user_name);
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
