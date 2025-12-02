package com.pluralsight.model;

public class Shipper {
    private int shipperID;
    private String companyName;
    private String phone;

    public Shipper(int shipperID, String companyName, String phone) {
        this.shipperID = shipperID;
        this.companyName = companyName;
        this.phone = phone;
    }

    public int getShipperID() {
        return shipperID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "\nshipper ID:" + shipperID +
                ", \ncompany Name:'" + companyName +
                ", \nPhone:'" + phone;
    }
}
