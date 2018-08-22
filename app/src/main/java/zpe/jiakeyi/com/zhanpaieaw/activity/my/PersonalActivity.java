package zpe.jiakeyi.com.zhanpaieaw.activity.my;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.util.JumpParameter;
import com.zhy.autolayout.AutoLinearLayout;

import java.io.File;

import zpe.jiakeyi.com.zhanpaieaw.R;

import static android.media.MediaRecorder.VideoSource.CAMERA;

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
    private AutoLinearLayout image_setting;
    private AutoLinearLayout sex_setting;
    private TextView phone_set_tv;
    private AutoLinearLayout phone_setting;
    private TextView is_checked_wx;
    private AutoLinearLayout wencht_setting;
    private TextView is_check_qq;
    private TextView text_camera;
    private TextView text_photo;
    private TextView text_finish;
    private static final int PICTURE = 200;
    private View contentView;
    private PopupWindow window;
    private LinearLayout ll;

    @Override
    public void initViews() {
        personal_user_name = findViewById(R.id.personal_user_name);
        personal_alter_pas = findViewById(R.id.personal_alter_pas);
        personal_imag_finish = findViewById(R.id.personal_imag_finish);
        image_setting = findViewById(R.id.image_setting);
        sex_setting = findViewById(R.id.sex_setting);
        phone_set_tv = findViewById(R.id.phone_set_tv);
        phone_setting = findViewById(R.id.phone_setting);
        is_checked_wx = findViewById(R.id.is_checked_wx);
        wencht_setting = findViewById(R.id.wencht_setting);
        ll = new LinearLayout(me);
        contentView = LayoutInflater.from(this).inflate(R.layout.layout_popuwindow, null, false);
        text_camera = contentView.findViewById(R.id.text_camera);
        text_photo = contentView.findViewById(R.id.text_photo);
        text_finish = contentView.findViewById(R.id.text_finish);
    }

    @Override
    public void initDatas(JumpParameter paramer) {
        // 创建PopupWindow对象，其中：
        // 第一个参数是用于PopupWindow中的View，第二个参数是PopupWindow的宽度，
        // 第三个参数是PopupWindow的高度，第四个参数指定PopupWindow能否获得焦点
        window = new PopupWindow(contentView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT, true);
        // 设置PopupWindow的背景
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //点击popupWindow外是否响应
        window.setFocusable(false);
        // 设置PopupWindow是否能响应外部点击事件
        window.setOutsideTouchable(false);
        // 设置PopupWindow是否能响应点击事件5
        window.setTouchable(true);
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
        //设置头像
        image_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.showAtLocation(v, Gravity.BOTTOM, 0, 0);
                lightoff();
            }
        });
        //调用相机
        text_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                windowCamera();
                window.dismiss();
                lighton();
            }
        });
        //调用相册
        text_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                windowPhoto();
            }
        });
        //取消
        text_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.dismiss();
                lighton();
            }
        });
        phone_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(MobileActivity.class);
            }
        });

    }

    private void windowCamera() {
        Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera, CAMERA);
    }

    private void windowPhoto() {
        Intent picture = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(picture, PICTURE);
        window.dismiss();
        lighton();
    }

    /**
     * 设置手机屏幕亮度变暗
     */
    private void lightoff() {
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 0.3f;
        getWindow().setAttributes(lp);
    }

    /**
     * 设置手机屏幕亮度显示正常
     */
    private void lighton() {
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 1f;
        getWindow().setAttributes(lp);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CAMERA && resultCode == RESULT_OK && data != null) {
            // 拍照
            Bundle bundle = data.getExtras();
            log(data);
            // 获取相机返回的数据，并转换为图片格式
            Bitmap bitmap = (Bitmap) bundle.get("data");
//            toastUtlis(bitmap, null);

            // TODO 图片从这里拿
//            Glide.with(this).load(bitmap).apply(new RequestOptions().circleCrop()).into(imagView);

        } else if (requestCode == PICTURE && resultCode == RESULT_OK && data != null) {
            /**
             * 调用图库
             */
            Uri selectedImage = data.getData();
            // TODO 图片从这里拿
//            Glide.with(this).load(selectedImage).apply(new RequestOptions().circleCrop()).into(imagView);
        }
    }
}
