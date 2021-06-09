package com.example.basic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deId;
    private String deName;
    private String deAddress;
    private String deCode;

    public long getDeId() {
        return deId;
    }

    public void setDeId(int deId) {
        this.deId = deId;
    }

    public String getDeName() {
        return deName;
    }

    public void setDeName(String deName) {
        this.deName = deName;
    }

    public String getDeAddress() {
        return deAddress;
    }

    public void setDeAddress(String deAddress) {
        this.deAddress = deAddress;
    }

    public String getDeCode() {
        return deCode;
    }

    public void setDeCode(String deCode) {
        this.deCode = deCode;
    }

    public Department(int deId, String deName, String deAddress, String deCode) {
        this.deId = deId;
        this.deName = deName;
        this.deAddress = deAddress;
        this.deCode = deCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "deId=" + deId +
                ", deName='" + deName + '\'' +
                ", deAddress='" + deAddress + '\'' +
                ", deCode='" + deCode + '\'' +
                '}';
    }
}
