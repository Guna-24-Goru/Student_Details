package com.faangtech.StudentData.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
    @Id
    @Column
    private Integer eno;
    @Column
    private String ename;
    @Column
    private String eLastName;
    @Column
    private String email;
    @Column
    private String eAddress;

    Employee(){}

    public Employee(Integer eno, String ename, String eLastName, String email, String eAddress) {
        this.eno = eno;
        this.ename = ename;
        this.eLastName = eLastName;
        this.email = email;
        this.eAddress = eAddress;
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String geteLastName() {
        return eLastName;
    }

    public void seteLastName(String eLastName) {
        this.eLastName = eLastName;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
