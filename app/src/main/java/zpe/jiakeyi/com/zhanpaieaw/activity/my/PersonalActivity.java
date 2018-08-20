package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.view.View;
import android.widget.ImageView;

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
 * @date 2018/7/26
 * 功能描述: 个人消息界面
 */
@Layout(R.layout.activity_personal)
@DarkStatusBarTheme(true)
public class PersonalActivity extends BaseActivity {
    private AutoLinearLayout personal_user_name;
    private AutoLinearLayout personal_alter_pas;
    private ImageView personal_imag_finish;


    @Override
    public void initViews() {
        personal_user_name = findViewById(R.id.personal_user_name);
        personal_alter_pas = findViewById(R.id.personal_alter_pas);
        personal_imag_finish = findViewById(R.id.personal_imag_finish);
    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        //跳转到用户名界面
        personal_user_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(UserNameActivity.class);
            }
        });
        //跳转到密码修改界面
        personal_alter_pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(PasswordActivity.class);
            }
        });
        //返回上一界面
        personal_imag_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
