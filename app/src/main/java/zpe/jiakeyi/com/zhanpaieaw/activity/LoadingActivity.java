package zpe.jiakeyi.com.zhanpaieaw.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import zpe.jiakeyi.com.zhanpaieaw.R;
/**
 * 创建人： Nine tails fox
 * 创建时间： 2018/8/17 10:38
 * 功能描述：自己写
 * 联系方式：1037438704@qq.com
 *
 * @author dell-pc
 */
public class LoadingActivity extends AppCompatActivity implements View.OnClickListener {

    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        initView();
    }

    private void initView() {
        but = (Button) findViewById(R.id.but);

        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:
                finish();
                break;
                default:
        }
    }
}
