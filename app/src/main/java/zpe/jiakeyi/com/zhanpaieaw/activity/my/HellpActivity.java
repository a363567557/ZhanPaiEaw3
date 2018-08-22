package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;
import com.zhy.autolayout.AutoLinearLayout;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.fragment.MassageFragment;

/**
 * @author Gjianfu
 * @date 2018/8/17
 * 功能描述:
 */

@Layout(R.layout.activity_hellp)
@DarkStatusBarTheme(true)
public class HellpActivity extends BaseActivity {
    private AutoLinearLayout hellp_atll_booth1;
    private AutoLinearLayout hellp_atll_booth2;
    private AutoLinearLayout hellp_atll_booth3;
    private AutoLinearLayout hellp_atll_booth4;
    private AutoLinearLayout hellp_atll_booth5;
    private ImageView title_back;
    private TextView title_name;
    private ImageView title_seek;
    private TextView title_text_right;

    @Override
    public void initViews() {
        hellp_atll_booth1 = findViewById(R.id.hellp_atll_booth1);
        hellp_atll_booth2 = findViewById(R.id.hellp_atll_booth2);
        hellp_atll_booth3 = findViewById(R.id.hellp_atll_booth3);
        hellp_atll_booth4 = findViewById(R.id.hellp_atll_booth4);
        hellp_atll_booth5 = findViewById(R.id.hellp_atll_booth5);
        title_back = findViewById(R.id.title_back);
        title_name = findViewById(R.id.title_name);
        title_seek = findViewById(R.id.title_seek);
        title_text_right = findViewById(R.id.title_text_right);
        title_name.setText("帮助中心");
        title_seek.setVisibility(View.GONE);
        title_text_right.setVisibility(View.VISIBLE);
    }

    @Override
    public void initDatas(JumpParameter paramer) {

    }

    @Override
    public void setEvents() {
        hellp_atll_booth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(HellpBoothActivity.class);
            }
        });
        hellp_atll_booth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(HellpBoothActivity.class);
            }
        });
        hellp_atll_booth3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(HellpBoothActivity.class);
            }
        });
        hellp_atll_booth4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(HellpBoothActivity.class);
            }
        });
        hellp_atll_booth5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(HellpBoothActivity.class);
            }
        });
        title_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        title_text_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(MassageFragment.class);
            }
        });
    }

}
