package com.zking.eurekaprovider.model;

public class SysUser {
    private Integer uid;

    private String username;

    private String upwd;

    public SysUser(Integer uid, String username, String upwd) {
        this.uid = uid;
        this.username = username;
        this.upwd = upwd;
    }

    public SysUser() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}