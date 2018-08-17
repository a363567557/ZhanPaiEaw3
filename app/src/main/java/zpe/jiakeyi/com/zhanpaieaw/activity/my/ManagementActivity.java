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
 * 创建人： Nine tails fox
 * 创建时间： 2018/8/9 12:00
 * 功能描述：消息提醒
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */

@Layout(R.layout.managementactivity)
@DarkStatusBarTheme(false)           //开启顶部状态栏图标、文字暗色模式
@DarkNavigationBarTheme(true)       //开启底部导航栏按钮暗色模式
@NavigationBarBackgroundColor(a = 0, r = 0, g = 0, b = 0)
public class ManagementActivity extends BaseActivity {

    private ImageView ll_lmage_1;
    private ImageView ll_lmage_2;
    private ImageView ll_lmage_3;
    private ImageView ll_lmage_4;
    private boolean aBoolean = false;

    @Override
    public void initViews() {
        ll_lmage_1 = findViewById(R.id.ll_lmage_1);
        ll_lmage_2 = findViewById(R.id.ll_lmage_2);
        ll_lmage_3 = findViewById(R.id.ll_lmage_3);
        ll_lmage_4 = findViewById(R.id.ll_lmage_4);
    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        ll_lmage_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_lmage_1.setSelected(aBoolean);
                if (aBoolean == true) {
                    aBoolean = false;
                } else {
                    aBoolean = true;
                }
            }
        });
        ll_lmage_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_lmage_1.setSelected(aBoolean);
                if (aBoolean == true) {
                    aBoolean = false;
                } else {
                    aBoolean = true;
                }
            }
        });
        ll_lmage_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_lmage_1.setSelected(aBoolean);
                if (aBoolean == true) {
                    aBoolean = false;
                } else {
                    aBoolean = true;
                }
            }
        });
        ll_lmage_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_lmage_1.setSelected(aBoolean);
                if (aBoolean == true) {
                    aBoolean = false;
                } else {
                    aBoolean = true;
                }
            }
        });
    }

}
