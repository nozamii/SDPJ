package com.example.DB.RealDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BraceletProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bid;
    private String bname;
    private double price;

     public BraceletProduct(String b,String bn,double p){
        this.bid=b;
        this.bname=bn;
        this.price=p;

    }

    public BraceletProduct() {

    }

    public void setId(String proid) {this.bid = proid;    }
    public String getId() {return bid; }

    public void setName(String pron) {this.bname = pron;    }
    public String getName() {return bname; }

    public void setPrice(double pron) {this.price = pron;    }
    public double getPrice() {return price; }
}
