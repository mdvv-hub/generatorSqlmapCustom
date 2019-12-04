package com.winter.projectmanager.bean.po;

public class AddressInfo {
    private String consigneeid;

    private String consignee;

    private String phone;

    private String location;

    private String detailedaddress;

    private String remark;

    public String getConsigneeid() {
        return consigneeid;
    }

    public void setConsigneeid(String consigneeid) {
        this.consigneeid = consigneeid == null ? null : consigneeid.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDetailedaddress() {
        return detailedaddress;
    }

    public void setDetailedaddress(String detailedaddress) {
        this.detailedaddress = detailedaddress == null ? null : detailedaddress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}