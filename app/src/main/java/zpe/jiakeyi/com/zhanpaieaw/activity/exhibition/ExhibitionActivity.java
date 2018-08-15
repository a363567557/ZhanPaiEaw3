package zpe.jiakeyi.com.zhanpaieaw.activity.exhibition;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;
import com.zhy.autolayout.AutoLinearLayout;

import zpe.jiakeyi.com.zhanpaieaw.R;
import zpe.jiakeyi.com.zhanpaieaw.activity.MainActivity;


public class ExhibitionActivity extends UnityPlayerActivity {

    private AutoLinearLayout scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibition);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        initView();
        UnityPlayer.UnitySendMessage("OtherPlatFormsObj", "GetUserID", "c714cf2c528f40d5b4108a3ca52b21db");
        UnityPlayer.UnitySendMessage("OtherPlatFormsObj", "GetAllShellSchemLoadMode", "");

    }


    private void initView() {
        scan = (AutoLinearLayout) findViewById(R.id.UnityView);
        View view = mUnityPlayer.getView();
        scan.addView(view);
    }


    @Override
    protected void onStop() {
        super.onStop();
        mUnityPlayer.quit();
        finish();
    }

    public static void ConnectError() {
        Log.i("U3D", "ConnectError: ");
    }

    public static void Share(String shellSchemId) {
        Log.i("Share", "Share: " + shellSchemId);
    }

    public static void BrochureDownLoad(final String path) {

        Log.i("U3D", "BrochureDownLoad: " + path);

    }

    public static void GetUserID() {
        Log.i("U3D", "GetUserID: ");
    }

    public static void GetShellSchemLoadType() {
        // 同样需要在UI线程下执行
        Log.i("U3D", "GetShellSchemLoadType: ");

    }

    @Override
    protected void onResume() {
        /**
         * 设置为横屏
         */
        if (getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        super.onResume();
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == keyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(i, keyEvent);
    }
}
