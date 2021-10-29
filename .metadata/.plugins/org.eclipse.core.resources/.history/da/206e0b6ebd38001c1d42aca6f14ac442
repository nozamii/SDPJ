package com.example.DB.RealDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cid;
    private String cname;
    private String ctell;
    private String address;

    public Customer() {

    }

    public Customer(long c, String cn, String t,String ad) {
        this.cid = c;
        this.cname = cn;
        this.ctell = t;
        this.address =ad;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setId(long proid) {
        this.cid = proid;
    }

    public long getId() {
        return cid;
    }

    public void setName(String pron) {
        this.cname = pron;
    }

    public String getName() {
        return cname;
    }

    public String getCtell() {
        return ctell;
    }

    public void setCtell(String ctell) {
        this.ctell = ctell;
    }
}
