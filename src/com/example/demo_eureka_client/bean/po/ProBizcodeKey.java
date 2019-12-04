package com.example.demo_eureka_client.bean.po;

public class ProBizcodeKey {
    private String codename;

    private String codevalues;

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename == null ? null : codename.trim();
    }

    public String getCodevalues() {
        return codevalues;
    }

    public void setCodevalues(String codevalues) {
        this.codevalues = codevalues == null ? null : codevalues.trim();
    }
}