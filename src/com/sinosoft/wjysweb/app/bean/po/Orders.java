package com.sinosoft.wjysweb.app.bean.po;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private String ordersid;

    private String ordersname;

    private String ordersdescription;

    private BigDecimal ordersprice;

    private String tradename;

    private Integer tradenum;

    private String paymentstatus;

    private String orderconsigneeid;

    private String orderconsigneename;

    private String orderconsigneeaddress;

    private String orderevaluation;

    private String validstatus;

    private Date creattime;

    private Date updatetime;

    public String getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid == null ? null : ordersid.trim();
    }

    public String getOrdersname() {
        return ordersname;
    }

    public void setOrdersname(String ordersname) {
        this.ordersname = ordersname == null ? null : ordersname.trim();
    }

    public String getOrdersdescription() {
        return ordersdescription;
    }

    public void setOrdersdescription(String ordersdescription) {
        this.ordersdescription = ordersdescription == null ? null : ordersdescription.trim();
    }

    public BigDecimal getOrdersprice() {
        return ordersprice;
    }

    public void setOrdersprice(BigDecimal ordersprice) {
        this.ordersprice = ordersprice;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename == null ? null : tradename.trim();
    }

    public Integer getTradenum() {
        return tradenum;
    }

    public void setTradenum(Integer tradenum) {
        this.tradenum = tradenum;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus == null ? null : paymentstatus.trim();
    }

    public String getOrderconsigneeid() {
        return orderconsigneeid;
    }

    public void setOrderconsigneeid(String orderconsigneeid) {
        this.orderconsigneeid = orderconsigneeid == null ? null : orderconsigneeid.trim();
    }

    public String getOrderconsigneename() {
        return orderconsigneename;
    }

    public void setOrderconsigneename(String orderconsigneename) {
        this.orderconsigneename = orderconsigneename == null ? null : orderconsigneename.trim();
    }

    public String getOrderconsigneeaddress() {
        return orderconsigneeaddress;
    }

    public void setOrderconsigneeaddress(String orderconsigneeaddress) {
        this.orderconsigneeaddress = orderconsigneeaddress == null ? null : orderconsigneeaddress.trim();
    }

    public String getOrderevaluation() {
        return orderevaluation;
    }

    public void setOrderevaluation(String orderevaluation) {
        this.orderevaluation = orderevaluation == null ? null : orderevaluation.trim();
    }

    public String getValidstatus() {
        return validstatus;
    }

    public void setValidstatus(String validstatus) {
        this.validstatus = validstatus == null ? null : validstatus.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}