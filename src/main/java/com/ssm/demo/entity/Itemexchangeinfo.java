package com.ssm.demo.entity;

import java.util.Date;

public class Itemexchangeinfo {
    private Integer id;

    private Integer donorId;

    private String donorName;

    private String city;

    private String province;

    private String street;

    private String cellNumber;

    private Date addTime;

    private String donateItem;

    private String note;

    private String addressPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDonorId() {
        return donorId;
    }

    public void setDonorId(Integer donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName == null ? null : donorName.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber == null ? null : cellNumber.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getDonateItem() {
        return donateItem;
    }

    public void setDonateItem(String donateItem) {
        this.donateItem = donateItem == null ? null : donateItem.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getAddressPath() {
        return addressPath;
    }

    public void setAddressPath(String addressPath) {
        this.addressPath = addressPath == null ? null : addressPath.trim();
    }
}