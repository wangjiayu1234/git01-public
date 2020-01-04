package com.zking.eurekaprovider.model;

import java.util.ArrayList;
import java.util.List;

public class SysFunction {
    private Long functionId;

    private String functionName;

    private String path;

    private Long parameter;

    private String method;

    private String functionDesc;

    private String icon;
    private List<SysFunction> children = new ArrayList<>();

    public List<SysFunction> getChildren() {
        return children;
    }

    public void setChildren(List<SysFunction> children) {
        this.children = children;
    }

    public SysFunction(Long functionId, String functionName, String path, Long parameter, String method, String functionDesc, String icon) {
        this.functionId = functionId;
        this.functionName = functionName;
        this.path = path;
        this.parameter = parameter;
        this.method = method;
        this.functionDesc = functionDesc;
        this.icon = icon;
    }

    public SysFunction() {
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

    public Long getParameter() {
        return parameter;
    }

    public void setParameter(Long parameter) {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}