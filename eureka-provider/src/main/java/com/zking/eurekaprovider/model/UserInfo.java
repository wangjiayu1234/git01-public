package com.zking.eurekaprovider.model;

import java.io.Serializable;

public class UserInfo implements Serializable{
    private Integer infoId;

    private String infoHao;

    private String infoName;

    private String infoYG;

    private String infoZt;

    private String infoGz;

    public UserInfo(Integer infoId, String infoHao, String infoName, String infoYG, String infoZt, String infoGz) {
        this.infoId = infoId;
        this.infoHao = infoHao;
        this.infoName = infoName;
        this.infoYG = infoYG;
        this.infoZt = infoZt;
        this.infoGz = infoGz;
    }

    public UserInfo() {
        super();
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getInfoHao() {
        return infoHao;
    }

    public void setInfoHao(String infoHao) {
        this.infoHao = infoHao;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoYG() {  return infoYG;    }

    public void setInfoYG(String infoYG) {
        this.infoYG = infoYG;
    }

    public String getInfoZt() {
        return infoZt;
    }

    public void setInfoZt(String infoZt) {
        this.infoZt = infoZt;
    }

    public String getInfoGz() {
        return infoGz;
    }

    public void setInfoGz(String infoGz) {
        this.infoGz = infoGz;
    }
}