package zpe.jiakeyi.com.zhanpaieaw.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import chihane.jdaddressselector.model.City;

/**
 * Created by Administrator on 2018/8/13.
 * 验证请求
 */

public class HttpUtlis {
    //验证码
    public static String code;
    //注册
    public static String register;
    //登录
    public static String login;
    //求购详情
    public static String detailsBuy;
    //广告
    public static String advertising;
    //分类查询
    public static String TypeBuy;
    //我的求购信息
    public static String MyBuy;
    //修改求购信息
    public static String SettingBuy;
    //判断是否收藏
    public static String DetailsBuy;
    //仪器详情
    public static String Instrument;
    //是否收藏
    public static String IfCollect;
    //仪器收藏列表
    public static String getCollpList;
    //热搜
    public static String HotSearch;
    //筛选仪器
    public static String Screening;
    //用户消息
    public static String UserMassage;
    //消息详情
    public static String MassageDetails;
    //城市地址
    public static String City;
    //仪器分类列表
    public static String sTs;

    //根据地址获取全部广告
    public static String RegisterData_Advertising(String i) {
        OkHttpUtils.post().url(RequestUtlis.getCode)
                .addHeader("loginType", "1")
                .addParams("i", i)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        advertising = response;
                    }
                });
        return advertising;
    }

    //请求验证码
    public static String RegisterData_Code(String string) {
        OkHttpUtils.post().url(RequestUtlis.getCode)
                .addHeader("loginType", "1")
                .addParams("iphone", string)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        code = response;
                    }
                });
        return code;
    }

    //注册接口
    public static String registerDate_Register(String phone, String password, final String code) {
        OkHttpUtils.post()
                .url(RequestUtlis.RegisterUser)
                .addParams("account", phone)
                .addParams("password", password)
                .addParams("code", code)
                .build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("失败", "onError: " + request);
            }

            @Override
            public void onResponse(String response) {
                Log.i("注册软件", "onResponse: " + response);
                register = response;
            }
        });
        return register;
    }

    //账号登录接口
    public static String registerDate_Login(String account, String password) {
        OkHttpUtils.post().url(RequestUtlis.UserLogin)
                .addHeader("loginType", "1")
                .addParams("account", account)
                .addParams("password", password)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        login = response;
                    }
                });
        return login;
    }

    //删除求购信息
    public static void registerDate_DeleteBuy(String id) {
        OkHttpUtils.post().url(RequestUtlis.UserLogin)
                .addHeader("loginType", "1")
                .addParams("id", id)
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

    //查看求购详情
    public static String registerDate_DetailsBuy(String id) {
        OkHttpUtils.post().url(RequestUtlis.GA)
                .addHeader("loginType", "1")
                .addParams("id", id)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        detailsBuy = response;
                    }
                });
        return detailsBuy;
    }

    //添加求购
    public static void registerDate_AddBuy(final Context mContext, String id, String loginId, String title, String content, String typeA, String typeAId, String addressA, String addressB, String addressC, String addressAId, String addressBId, String addressCId, String iphoneNo, @Nullable String wechat, @Nullable String qq, String imgs) {
        OkHttpUtils.post().url(RequestUtlis.IA)
                .addHeader("loginType", "1")
                .addParams("loginId", loginId)
                .addParams("title", title)
                .addParams("content", content)
                .addParams("typeA", typeA)
                .addParams("typeAId", typeAId)
                .addParams("addressA", addressA)
                .addParams("addressB", addressB)
                .addParams("addressC", addressC)
                .addParams("addressAId", addressAId)
                .addParams("addressBId", addressBId)
                .addParams("addressCId", addressCId)
                .addParams("iphoneNo", iphoneNo)
                .addParams("wechat", wechat)
                .addParams("qq", qq)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(mContext, "添加成功", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    //根据分类查找求购信息
    // null全部 0仪器 1服务 2家具 3耗材
    public static String registerDate_TypeBuy(String typea) {
        OkHttpUtils.post().url(RequestUtlis.SATY)
                .addHeader("loginType", "1")
                .addParams("typea", typea)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        TypeBuy = response;
                    }
                });
        return TypeBuy;
    }

    //查询我的求购信息，已解决，未解决
    //状态 null全部 0未解决 1已解决
    public static String registerDate_MyBuy(String pageSize, String pageNum, String userId, String solveStatus) {
        OkHttpUtils.post().url(RequestUtlis.sAu)
                .addHeader("loginType", "1")
                .addParams("pageSize", pageSize)
                .addParams("pageNum", pageNum)
                .addParams("userId", userId)
                .addParams("solveStatus", solveStatus)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        MyBuy = response;
                    }
                });
        return MyBuy;
    }

    //修改求购信息
    public static String registerDate_SettingBuy(final Context mContext, String id, String loginId, String title, String content, String typeA, String typeAId, String addressA, String addressB, String addressC, String addressAId, String addressBId, String addressCId, String iphoneNo, @Nullable String wechat, @Nullable String qq, String imgs) {
        OkHttpUtils.post().url(RequestUtlis.uA)
                .addHeader("loginType", "1")
                .addParams("loginId", loginId)
                .addParams("title", title)
                .addParams("content", content)
                .addParams("typeA", typeA)
                .addParams("typeAId", typeAId)
                .addParams("addressA", addressA)
                .addParams("addressB", addressB)
                .addParams("addressC", addressC)
                .addParams("addressAId", addressAId)
                .addParams("addressBId", addressBId)
                .addParams("addressCId", addressCId)
                .addParams("iphoneNo", iphoneNo)
                .addParams("wechat", wechat)
                .addParams("qq", qq)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        SettingBuy = response;
                    }
                });
        return SettingBuy;
    }

    //刷新求购信息
    public static void registerDate_RefreshBuy(String id) {
        OkHttpUtils.post().url(RequestUtlis.uAda)
                .addHeader("loginType", "1")
                .addParams("id", id)
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

    //添加收藏、取消收藏 0=添加收藏，1=取消收藏
    public static String registerDate_DetailsBuy(String userId, String productId, String status) {
        OkHttpUtils.post().url(RequestUtlis.CPStatus)
                .addHeader("loginType", "1")
                .addParams("userId", userId)
                .addParams("id", productId)
                .addParams("id", status)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        DetailsBuy = response;
                    }
                });
        return DetailsBuy;
    }

    //查看求购详情
    public static String registerDate_Instrument(String id) {
        OkHttpUtils.post().url(RequestUtlis.getP)
                .addHeader("loginType", "1")
                .addParams("id", id)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        Instrument = response;
                    }
                });
        return Instrument;
    }

    //判断收藏状态G status 0=未收藏 1=已收藏
    public static String registerDate_IfCollect(String userId, String productId) {
        OkHttpUtils.post().url(RequestUtlis.ifCP)
                .addHeader("loginType", "1")
                .addParams("userId", userId)
                .addParams("productId", productId)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        IfCollect = response;
                    }
                });
        return IfCollect;
    }

    //获取仪器收藏列表
    public static String registerDate_getCollpList(String Token) {
        OkHttpUtils.post().url(RequestUtlis.selCollP)
                .addHeader("loginType", "1")
                .addParams("Token", Token)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        getCollpList = response;
                    }
                });
        return getCollpList;
    }

    //A筛选仪器
    public static String registerDate_Screening(String pageSize, String pageNum, @Nullable String zh, @Nullable String pageView, @Nullable String date, @Nullable String areaA, @Nullable String areaB, @Nullable String areaC) {
        OkHttpUtils.post().url(RequestUtlis.selP)
                .addHeader("loginType", "1")
                .addParams("pageSize", pageSize)
                .addParams("pageNum", pageNum)
                .addParams("zh", zh)
                .addParams("pageView", pageView)
                .addParams("date", date)
                .addParams("areaA", areaA)
                .addParams("areaB", areaB)
                .addParams("areaC", areaC)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        Screening = response;
                    }
                });
        return Screening;
    }

    //热搜搜索
    public static String registerDate_HotSearch() {
        OkHttpUtils.post().url(RequestUtlis.sSE)
                .addHeader("loginType", "1")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        HotSearch = response;
                    }
                });
        return HotSearch;
    }


    //查询用户系统消息
    public static String registerDate_UserMassage() {
        OkHttpUtils.post().url(RequestUtlis.sAty)
                .addHeader("loginType", "1")
                .addParams("Token", RequestUtlis.Token)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        UserMassage = response;
                    }
                });
        return UserMassage;
    }

    //查看消息详情
    public static String registerDate_MassageDetails(String id) {
        OkHttpUtils.post().url(RequestUtlis.gM)
                .addHeader("loginType", "1")
                .addParams("Token", RequestUtlis.Token)
                .addParams("id", id)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                    }

                    @Override
                    public void onResponse(String response) {
                        MassageDetails = response;
                    }
                });
        return MassageDetails;
    }

    //城市获取
    public static String registerDate_City() {
        OkHttpUtils
                .post()
                .url(RequestUtlis.sAr)
                .addParams("", "")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {

                    }

                    @Override
                    public void onResponse(String response) {
                        City = response;
                    }
                });
        return City;
    }

    //仪器分类列表
    public static void registerDate_sTs() {

    }

    public static String sTs_return() {
        if (sTs != null) {
            return sTs;
        } else {
            registerDate_sTs();
            return sTs;
        }
    }
}
