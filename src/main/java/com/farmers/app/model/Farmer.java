package com.farmers.app.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Farmer {
    private int id;
    private String name;
    private String username;
    private double income;
    private String password;
    private String mobileno;
    private String address;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "income", nullable = false, precision = 0)
    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 10)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "mobileno", nullable = false, length = 10)
    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmer farmer = (Farmer) o;
        return id == farmer.id &&
                Double.compare(farmer.income, income) == 0 &&
                Objects.equals(name, farmer.name) &&
                Objects.equals(username, farmer.username) &&
                Objects.equals(password, farmer.password) &&
                Objects.equals(mobileno, farmer.mobileno) &&
                Objects.equals(address, farmer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, income, password, mobileno, address);
    }
}
