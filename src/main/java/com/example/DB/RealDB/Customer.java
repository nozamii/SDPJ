package com.example.DB.RealDB;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cid;
    private String cname;
    private String ctell;

    public Customer(){

    }

    public Customer(String c,String cn,String t){
        this.cid=c;
        this.cname=cn;
        this.ctell=t;
    }
    public void setId(String proid) {this.cid = proid;    }
    public String getId() {return cid; }

    public void setName(String pron) {this.cname = pron;    }
    public String getName() {return cname; }

    public String getCtell() { return ctell; }
    public void setCtell(String ctell) { this.ctell = ctell; }
}
