package com.zking.eurekaprovider.model;

import java.util.Date;

public class SysFunctionWeb {
    private Long functionId;

    private String functionName;

    private String path;

    private String parameter;

    private String method;

    private String functionDesc;

    private Date upTime;

    public SysFunctionWeb(Long functionId, String functionName, String path, String parameter, String method, String functionDesc, Date upTime) {
        this.functionId = functionId;
        this.functionName = functionName;
        this.path = path;
        this.parameter = parameter;
        this.method = method;
        this.functionDesc = functionDesc;
        this.upTime = upTime;
    }

    public SysFunctionWeb() {
        super();
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFunctionDesc() {
        return functionDesc;
    }

    public void setFunctionDesc(String functionDesc) {
        this.functionDesc = functionDesc;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }
}