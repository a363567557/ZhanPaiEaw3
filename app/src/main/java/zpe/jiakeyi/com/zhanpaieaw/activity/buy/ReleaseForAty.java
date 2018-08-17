package zpe.jiakeyi.com.zhanpaieaw.activity.buy;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kongzue.baseframework.BaseActivity;
import com.kongzue.baseframework.interfaces.DarkNavigationBarTheme;
import com.kongzue.baseframework.interfaces.DarkStatusBarTheme;
import com.kongzue.baseframework.interfaces.Layout;
import com.kongzue.baseframework.interfaces.NavigationBarBackgroundColor;
import com.kongzue.baseframework.util.JumpParameter;
import com.squareup.okhttp.Request;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import chihane.jdaddressselector.model.City;
import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.bean.CityBean;
import zpe.jiakeyi.com.zhanpaieaw.utils.RequestUtlis;
import zpe.jiakeyi.com.zhanpaieaw.utils.ToastUtlis;

import static android.media.MediaRecorder.VideoSource.CAMERA;

/**
 * 创建人： 郭健福
 * 创建时间： 2018/7/23 21:44
 * 功能描述：发布求购页
 *
 * @author dell-pc
 */
@Layout(R.layout.activity_release_for_aty)
@DarkStatusBarTheme(false) //开启顶部状态栏图标、文字暗色模式
@NavigationBarBackgroundColor(a = 255, r = 255, g = 255, b = 255)
//透明颜色   设置底部导航栏背景颜色（a = 255,r = 255,g = 255,b = 255 黑色的)
@DarkNavigationBarTheme(true) //开启底部导航栏按钮暗色模式
public class ReleaseForAty extends BaseActivity {
    private static final int PICTURE = 200;
    private TextView rf_tv_fabu;
    private TextView text_camera;
    private TextView text_photo;
    private TextView text_finish;
    private View contentView;
    private PopupWindow window;
    private LinearLayout ll;
    private ImageView release_imag_camera;
    private AutoRelativeLayout release_rl_classify;
    private AlertDialog dialog;
    private View view;
    private RecyclerView dialog_recyclerView;
    private TextView auto_tv_ch;
    private static String city;

    @Override
    public void initViews() {
        auto_tv_ch = findViewById(R.id.auto_tv_ch);
        view = LayoutInflater.from(me).inflate(R.layout.dialog_my_classify, null);
        dialog_recyclerView = view.findViewById(R.id.dialog_recyclerView);

        rf_tv_fabu = findViewById(R.id.rf_tv_fabu);
        release_imag_camera = findViewById(R.id.release_imag_camera);
        release_rl_classify = findViewById(R.id.release_rl_classify);
        // 用于PopupWindow的View
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
        // 设置PopupWindow是否能响应点击事件
        window.setTouchable(true);
    }

    public void registerData() {
        OkHttpUtils.post().url(RequestUtlis.IA)
                .addHeader("loginType", "1")
                .addParams("", "")
                .addParams("", "")
                .addParams("", "")
                .addParams("", "")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {

                    }

                    @Override
                    public void onResponse(String response) {

                    }
                });
    }

    public static void setSheng(CityBean.ListBeanXX Sheng) {
        city = new String();
    }

    public static void setShi(CityBean.ListBeanXX.ListBeanX Sheng) {
        city = Sheng + "  ";
    }

    public static void setQu(CityBean.ListBeanXX.ListBeanX.ListBean Sheng) {
        city = city + Sheng;
    }

    @Override
    public void setEvents() {
        //城市选择器
        auto_tv_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump(CitySelectionActivity.class);
            }
        });
        //调用相机
        release_imag_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.showAtLocation(v, Gravity.BOTTOM, 0, 0);
                lightoff();
            }
        });
        //分类对话框
        release_rl_classify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //这里是发布
        rf_tv_fabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("发布按钮");
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
            // 获取相机返回的数据，并转换为图片格式
            Bitmap bitmap = (Bitmap) bundle.get("data");
            toastUtlis(bitmap, null);
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

    private void toastUtlis(Bitmap bitmap, Uri string) {
        ImageView imageView = new ImageView(me);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Glide.with(this).load(string).apply(new RequestOptions().circleCrop()).into(imageView);
        }
        ll.addView(imageView);
        TextView textView = new TextView(me);
        textView.setText("带图片的Toast信息");
        ll.addView(textView);
        ToastUtlis.showImageToast(me, ll);
    }
}
