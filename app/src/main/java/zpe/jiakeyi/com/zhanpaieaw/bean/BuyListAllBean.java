package zpe.jiakeyi.com.zhanpaieaw.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */

public class BuyListAllBean {


    /**
     * code : 1
     * data : {"list":[{"addressA":"天津","addressAId":1,"addressB":"天津","addressBId":2,"addressC":"南开区","addressCId":3,"authentication":0,"contactOrder":"1","content":"xxxxxxxxxxxx","createTime":"2018-07-30 10:22:52.0","delFlg":0,"id":"555","iphoneNo":"13512488886","loginId":"123","pageView":0,"qq":"1234567898","solveState":0,"title":"title","typeA":"123","typeAId":3,"typeB":"123","typeC":"123","typeD":"123","updateTime":"2018-07-30 10:22:52.0","wechat":"13512488886"},{"addressA":"天津","addressAId":1,"addressB":"天津","addressBId":2,"addressC":"南开区","addressCId":3,"authentication":0,"contactOrder":"1","content":"xxxxxxxxxxxx","createTime":"2018-07-30 10:22:52.0","delFlg":0,"id":"111","iphoneNo":"13512488886","loginId":"123","pageView":5,"qq":"1234567898","solveState":0,"title":"title","typeA":"123","typeAId":1,"typeB":"123","typeC":"123","typeD":"123","updateTime":"2018-07-25 18:32:01.0","wechat":"13512488886"},{"addressA":"天津","addressAId":1,"addressB":"天津","addressBId":2,"addressC":"南开区","addressCId":3,"authentication":0,"contactOrder":"1","content":"xxxxxxxxxxxx","createTime":"2018-07-30 10:22:52.0","delFlg":0,"id":"222","iphoneNo":"13512488886","loginId":"123","pageView":0,"qq":"1234567898","solveState":0,"title":"title","typeA":"123","typeAId":1,"typeB":"123","typeC":"123","typeD":"123","updateTime":"2018-07-18 18:32:04.0","wechat":"13512488886"},{"addressA":"天津","addressAId":1,"addressB":"天津","addressBId":2,"addressC":"南开区","addressCId":3,"authentication":0,"contactOrder":"1","content":"xxxxxxxxxxxx","createTime":"2018-07-30 10:22:52.0","delFlg":0,"id":"333","iphoneNo":"13512488886","loginId":"123","pageView":1,"qq":"1234567898","solveState":0,"title":"title","typeA":"123","typeAId":2,"typeB":"123","typeC":"123","typeD":"123","updateTime":"2018-07-11 18:32:07.0","wechat":"13512488886"},{"addressA":"天津","addressAId":1,"addressB":"天津","addressBId":2,"addressC":"南开区","addressCId":3,"authentication":0,"contactOrder":"1","content":"xxxxxxxxxxxx","createTime":"2018-07-30 10:22:52.0","delFlg":0,"id":"444","iphoneNo":"13512488886","loginId":"123","pageView":2,"qq":"1234567898","solveState":0,"title":"title","typeA":"123","typeAId":2,"typeB":"123","typeC":"123","typeD":"123","updateTime":"2018-07-04 18:32:10.0","wechat":"13512488886"}]}
     * msg : success
     */

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * addressA : 天津
             * addressAId : 1
             * addressB : 天津
             * addressBId : 2
             * addressC : 南开区
             * addressCId : 3
             * authentication : 0
             * contactOrder : 1
             * content : xxxxxxxxxxxx
             * createTime : 2018-07-30 10:22:52.0
             * delFlg : 0
             * id : 555
             * iphoneNo : 13512488886
             * loginId : 123
             * pageView : 0
             * qq : 1234567898
             * solveState : 0
             * title : title
             * typeA : 123
             * typeAId : 3
             * typeB : 123
             * typeC : 123
             * typeD : 123
             * updateTime : 2018-07-30 10:22:52.0
             * wechat : 13512488886
             */

            private String addressA;
            private int addressAId;
            private String addressB;
            private int addressBId;
            private String addressC;
            private int addressCId;
            private int authentication;
            private String contactOrder;
            private String content;
            private String createTime;
            private int delFlg;
            private String id;
            private String iphoneNo;
            private String loginId;
            private int pageView;
            private String qq;
            private int solveState;
            private String title;
            private String typeA;
            private int typeAId;
            private String typeB;
            private String typeC;
            private String typeD;
            private String updateTime;
            private String wechat;

            public String getAddressA() {
                return addressA;
            }

            public void setAddressA(String addressA) {
                this.addressA = addressA;
            }

            public int getAddressAId() {
                return addressAId;
            }

            public void setAddressAId(int addressAId) {
                this.addressAId = addressAId;
            }

            public String getAddressB() {
                return addressB;
            }

            public void setAddressB(String addressB) {
                this.addressB = addressB;
            }

            public int getAddressBId() {
                return addressBId;
            }

            public void setAddressBId(int addressBId) {
                this.addressBId = addressBId;
            }

            public String getAddressC() {
                return addressC;
            }

            public void setAddressC(String addressC) {
                this.addressC = addressC;
            }

            public int getAddressCId() {
                return addressCId;
            }

            public void setAddressCId(int addressCId) {
                this.addressCId = addressCId;
            }

            public int getAuthentication() {
                return authentication;
            }

            public void setAuthentication(int authentication) {
                this.authentication = authentication;
            }

            public String getContactOrder() {
                return contactOrder;
            }

            public void setContactOrder(String contactOrder) {
                this.contactOrder = contactOrder;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public int getDelFlg() {
                return delFlg;
            }

            public void setDelFlg(int delFlg) {
                this.delFlg = delFlg;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIphoneNo() {
                return iphoneNo;
            }

            public void setIphoneNo(String iphoneNo) {
                this.iphoneNo = iphoneNo;
            }

            public String getLoginId() {
                return loginId;
            }

            public void setLoginId(String loginId) {
                this.loginId = loginId;
            }

            public int getPageView() {
                return pageView;
            }

            public void setPageView(int pageView) {
                this.pageView = pageView;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public int getSolveState() {
                return solveState;
            }

            public void setSolveState(int solveState) {
                this.solveState = solveState;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTypeA() {
                return typeA;
            }

            public void setTypeA(String typeA) {
                this.typeA = typeA;
            }

            public int getTypeAId() {
                return typeAId;
            }

            public void setTypeAId(int typeAId) {
                this.typeAId = typeAId;
            }

            public String getTypeB() {
                return typeB;
            }

            public void setTypeB(String typeB) {
                this.typeB = typeB;
            }

            public String getTypeC() {
                return typeC;
            }

            public void setTypeC(String typeC) {
                this.typeC = typeC;
            }

            public String getTypeD() {
                return typeD;
            }

            public void setTypeD(String typeD) {
                this.typeD = typeD;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getWechat() {
                return wechat;
            }

            public void setWechat(String wechat) {
                this.wechat = wechat;
            }
        }
    }
}
