package com.example.demo_eureka_client.bean.po;

public class SysconfigKey {
    private String parametercode;

    private String parametertype;

    public String getParametercode() {
        return parametercode;
    }

    public void setParametercode(String parametercode) {
        this.parametercode = parametercode == null ? null : parametercode.trim();
    }

    public String getParametertype() {
        return parametertype;
    }

    public void setParametertype(String parametertype) {
        this.parametertype = parametertype == null ? null : parametertype.trim();
    }
}