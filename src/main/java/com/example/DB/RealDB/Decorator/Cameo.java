package com.example.DB.RealDB.Decorator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cameo {
    @Id
    private String cameoid;
    private String cameoname;
    private double cameoprice;

    public void setId(String proid) {this.cameoid = proid;    }
    public String getId() {return cameoid; }

    public void setName(String pron) {this.cameoname = pron;    }
    public String getName() {return cameoname; }

    public void setPrice(double pron) {this.cameoprice = pron;    }
    public double getPrice() {return cameoprice; }
}
