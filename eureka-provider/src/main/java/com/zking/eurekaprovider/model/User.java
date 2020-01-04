package com.zking.eurekaprovider.model;

public class User {
    private Integer uid;

    private String uname;

    private String upwd;

    private Integer infoId;

    public User(Integer uid, String uname, String upwd, Integer infoId) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.infoId = infoId;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }
}