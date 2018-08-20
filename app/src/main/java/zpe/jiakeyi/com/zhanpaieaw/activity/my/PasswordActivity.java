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

/**
 * 创建人： 九尾妖狐
 * 创建时间： 2018/1/18 9:32
 * 功能描述：修改密码
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */
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
