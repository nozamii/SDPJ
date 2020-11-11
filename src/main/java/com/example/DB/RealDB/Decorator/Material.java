package com.example.DB.RealDB.Decorator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Material {
    @Id
    private String mateid;
    private String matename;
    private double mateprice;

    public void setMateid(String mateid) { this.mateid = mateid; }
    public String getMateid() { return mateid; }

    public void setName(String pron) {this.matename = pron;    }
    public String getName() {return matename; }

    public void setPrice(double pron) {this.mateprice = pron;    }
    public double getPrice() {return mateprice; }
}
