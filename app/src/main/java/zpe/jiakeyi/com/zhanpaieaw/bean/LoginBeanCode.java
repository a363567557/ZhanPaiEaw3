package zpe.jiakeyi.com.zhanpaieaw.bean;

/**
 * Created by Administrator on 2018/8/15.
 */

public class LoginBeanCode {
    /**
     * code : 1
     * msg : success
     * data : {"userInfo":{"id":"0d4fbd3293854028b9529af5b51319d8","account":"18810379038","password":"978ea5f3d021b235ab6757fce835ae1d","username":"李四","nickname":null,"viaUrl":null,"sex":null,"loginState":null,"postId":0,"postName":null,"messageId":null,"iphone":"18810379038","qq":null,"mail":null,"wechat":null,"wechatQr":null,"firmId":null,"status":null,"delFlag":0,"createTime":"2018-08-13 00:00:00.0"},"ACCESS_TOKEN":"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxODgxMDM3OTAzOCIsImlhdCI6MTUzNDMzNDU3NSwic3ViIjoiamt5LmFkbWluLnVzZXIiLCJpc3MiOiJ3d3cuamt5LmNvbSIsImV4cCI6MTUzNDMzODE3NX0.lcjxxLG9c9VgfNFCidebExJ9fLghKSApEjaoh6GzDmU"}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userInfo : {"id":"0d4fbd3293854028b9529af5b51319d8","account":"18810379038","password":"978ea5f3d021b235ab6757fce835ae1d","username":"李四","nickname":null,"viaUrl":null,"sex":null,"loginState":null,"postId":0,"postName":null,"messageId":null,"iphone":"18810379038","qq":null,"mail":null,"wechat":null,"wechatQr":null,"firmId":null,"status":null,"delFlag":0,"createTime":"2018-08-13 00:00:00.0"}
         * ACCESS_TOKEN : eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxODgxMDM3OTAzOCIsImlhdCI6MTUzNDMzNDU3NSwic3ViIjoiamt5LmFkbWluLnVzZXIiLCJpc3MiOiJ3d3cuamt5LmNvbSIsImV4cCI6MTUzNDMzODE3NX0.lcjxxLG9c9VgfNFCidebExJ9fLghKSApEjaoh6GzDmU
         */

        private UserInfoBean userInfo;
        private String ACCESS_TOKEN;

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public String getACCESS_TOKEN() {
            return ACCESS_TOKEN;
        }

        public void setACCESS_TOKEN(String ACCESS_TOKEN) {
            this.ACCESS_TOKEN = ACCESS_TOKEN;
        }

        public static class UserInfoBean {
            /**
             * id : 0d4fbd3293854028b9529af5b51319d8
             * account : 18810379038
             * password : 978ea5f3d021b235ab6757fce835ae1d
             * username : 李四
             * nickname : null
             * viaUrl : null
             * sex : null
             * loginState : null
             * postId : 0
             * postName : null
             * messageId : null
             * iphone : 18810379038
             * qq : null
             * mail : null
             * wechat : null
             * wechatQr : null
             * firmId : null
             * status : null
             * delFlag : 0
             * createTime : 2018-08-13 00:00:00.0
             */

            private String id;
            private String account;
            private String password;
            private String username;
            private Object nickname;
            private Object viaUrl;
            private Object sex;
            private Object loginState;
            private int postId;
            private Object postName;
            private Object messageId;
            private String iphone;
            private Object qq;
            private Object mail;
            private Object wechat;
            private Object wechatQr;
            private Object firmId;
            private Object status;
            private int delFlag;
            private String createTime;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public Object getNickname() {
                return nickname;
            }

            public void setNickname(Object nickname) {
                this.nickname = nickname;
            }

            public Object getViaUrl() {
                return viaUrl;
            }

            public void setViaUrl(Object viaUrl) {
                this.viaUrl = viaUrl;
            }

            public Object getSex() {
                return sex;
            }

            public void setSex(Object sex) {
                this.sex = sex;
            }

            public Object getLoginState() {
                return loginState;
            }

            public void setLoginState(Object loginState) {
                this.loginState = loginState;
            }

            public int getPostId() {
                return postId;
            }

            public void setPostId(int postId) {
                this.postId = postId;
            }

            public Object getPostName() {
                return postName;
            }

            public void setPostName(Object postName) {
                this.postName = postName;
            }

            public Object getMessageId() {
                return messageId;
            }

            public void setMessageId(Object messageId) {
                this.messageId = messageId;
            }

            public String getIphone() {
                return iphone;
            }

            public void setIphone(String iphone) {
                this.iphone = iphone;
            }

            public Object getQq() {
                return qq;
            }

            public void setQq(Object qq) {
                this.qq = qq;
            }

            public Object getMail() {
                return mail;
            }

            public void setMail(Object mail) {
                this.mail = mail;
            }

            public Object getWechat() {
                return wechat;
            }

            public void setWechat(Object wechat) {
                this.wechat = wechat;
            }

            public Object getWechatQr() {
                return wechatQr;
            }

            public void setWechatQr(Object wechatQr) {
                this.wechatQr = wechatQr;
            }

            public Object getFirmId() {
                return firmId;
            }

            public void setFirmId(Object firmId) {
                this.firmId = firmId;
            }

            public Object getStatus() {
                return status;
            }

            public void setStatus(Object status) {
                this.status = status;
            }

            public int getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(int delFlag) {
                this.delFlag = delFlag;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }
        }
    }
}
