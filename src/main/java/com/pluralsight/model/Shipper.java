package com.pluralsight.model;

public class Shipper {
    private int shipperID;
    private String companyName;
    private String Phone;

    public Shipper(int shipperID, String companyName, String phone) {
        this.shipperID = shipperID;
        this.companyName = companyName;
        Phone = phone;
    }

    public int getShipperID() {
        return shipperID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhone() {
        return Phone;
    }

    @Override
    public String toString() {
        return "shipper ID:" + shipperID +
                ", companyName:'" + companyName + '\'' +
                ", Phone:'" + Phone + '\'';
    }
}
