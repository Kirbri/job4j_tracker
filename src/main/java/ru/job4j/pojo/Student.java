package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fullName;
    private short numberOfGroup;
    private Date dateOfReceipt;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public short getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(short numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }
}
