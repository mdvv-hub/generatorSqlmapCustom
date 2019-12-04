package com.example.demo_eureka_client.bean.po;

public class Sysconfig extends SysconfigKey {
    private String parametervalue;

    private String parameterdesc;

    private String remark;

    private String validstatus;

    public String getParametervalue() {
        return parametervalue;
    }

    public void setParametervalue(String parametervalue) {
        this.parametervalue = parametervalue == null ? null : parametervalue.trim();
    }

    public String getParameterdesc() {
        return parameterdesc;
    }

    public void setParameterdesc(String parameterdesc) {
        this.parameterdesc = parameterdesc == null ? null : parameterdesc.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getValidstatus() {
        return validstatus;
    }

    public void setValidstatus(String validstatus) {
        this.validstatus = validstatus == null ? null : validstatus.trim();
    }
}