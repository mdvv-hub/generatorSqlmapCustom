package com.example.demo_eureka_client.bean.po;

public class ProBizcode extends ProBizcodeKey {
    private String codecname;

    private String codeename;

    private String validstatus;

    private String codedesc;

    public String getCodecname() {
        return codecname;
    }

    public void setCodecname(String codecname) {
        this.codecname = codecname == null ? null : codecname.trim();
    }

    public String getCodeename() {
        return codeename;
    }

    public void setCodeename(String codeename) {
        this.codeename = codeename == null ? null : codeename.trim();
    }

    public String getValidstatus() {
        return validstatus;
    }

    public void setValidstatus(String validstatus) {
        this.validstatus = validstatus == null ? null : validstatus.trim();
    }

    public String getCodedesc() {
        return codedesc;
    }

    public void setCodedesc(String codedesc) {
        this.codedesc = codedesc == null ? null : codedesc.trim();
    }
}