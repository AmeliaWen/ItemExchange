package com.ssm.demo.dao;

public class ItemExchangeInfoDto {
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

    public ItemExchangeInfoDto(Integer id,Integer donorId, String donorName, String city,
                          String province,String street,String cellNumber,Date addTime, String donateItem,String note,String addressPath){
        this.id = id;
        this.donorId = donorId;
        this.donorName = donorName;
        this.city = city;
        this.province = province;
        this.street = street;
        this.cellNumber = cellNumber;
        this.addTime = addTime;
        this.donateItem = donateItem;
        this.note = note;
        this.addressPath = addressPath;
    }

    public Integer getId(){
        return id;
    }

    public Integer getDonorId(){
        return donorId;
    }
    public String getDonorName(){
        return donorName;
    }
    public String getCity(){
        return city;
    }
    public String getProvince(){
        return province;
    }
    public String getStreet(){
        return street;
    }
    public String getCellNumber(){
        return cellNumber;
    }
    public String getDonateItem(){
        return donateItem;
    }
    public String getNote(){
        return note;
    }
    public String getAddressPath(){
        return addressPath;
    }
    public Date getAddTime(){
        return addTime;
    }
}
