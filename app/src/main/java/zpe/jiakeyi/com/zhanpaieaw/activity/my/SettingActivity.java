package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;
import com.zhy.autolayout.AutoLinearLayout;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.utils.RequestUtlis;

@Layout(R.layout.activity_setting)
@DarkStatusBarTheme(false) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255, r = 255, g = 255, b = 255)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的)
@DarkNavigationBarTheme(false) //开启底部导航栏按钮暗色模式
public class SettingActivity extends BaseActivity {

    private ImageView personal_imag_finish;
    private AutoLinearLayout record_auto1;
    private AutoLinearLayout record_auto2;
    private AutoLinearLayout record_auto3;
    private AutoLinearLayout record_auto4;
    private AutoLinearLayout record_auto5;

    @Override
    public void initViews() {
        personal_imag_finish = findViewById(R.id.personal_imag_finish);
        record_auto1 = findViewById(R.id.record_auto1);
        record_auto2 = findViewById(R.id.record_auto2);
        record_auto3 = findViewById(R.id.record_auto3);
        record_auto4 = findViewById(R.id.record_auto4);
        record_auto5 = findViewById(R.id.record_auto5);

    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        personal_imag_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        record_auto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        record_auto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        record_auto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        record_auto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        record_auto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestUtlis.Token = null;
                RequestUtlis.ID = null;
                finish();
                Toast.makeText(me, "您已退出登录", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
