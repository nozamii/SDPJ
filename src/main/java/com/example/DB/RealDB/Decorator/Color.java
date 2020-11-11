package com.example.DB.RealDB.Decorator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Color {
    @Id
    private String colorid;
    private String colorname;
    private double colorprice;


    public void setId(String proid) {this.colorid = proid;    }
    public String getId() {return colorid; }

    public void setName(String pron) {this.colorname = pron;    }
    public String getName() {return colorname; }

    public void setPrice(double pron) {this.colorprice = pron;    }
    public double getPrice() {return colorprice; }

}
