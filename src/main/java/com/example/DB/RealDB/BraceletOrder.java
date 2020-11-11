package com.example.DB.RealDB;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BraceletOrder {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String oid;
        private String braceletid;
        private String customerid;
        private String braceletname;
        private String customername;
        private double price;
        private Date dateorder;

        public BraceletOrder(){

        }
        public BraceletOrder(String oid,String cid,String bid,String bname,String cname,double p){
            this.oid=oid;
            this.braceletid=bid;
            this.customerid=cid;
            this.braceletname=bname;
            this.customername=cname;
            this.price=p;

        }
        public String getOid() {return oid;}
        public void setOid(String oid) { this.oid = oid;}

        public String getBid() {return braceletid; }
        public void setBid(String bid) { this.braceletid = bid; }

        public String getBname() { return braceletname; }
        public void setBname(String bname) { this.braceletname = bname; }

        public String getCid() {return customerid; }
        public void setCid(String cid) { this.customerid = cid; }

        public String getCname() { return customername; }
        public void setCname(String cname) { this.customername = cname; }

        public void setPrice(double pron) {this.price = pron;    }
        public double getPrice() {return price; }

        public void setDate(Date dnow){ this.dateorder=dnow;}
        public Date getDateorder() {return dateorder; }





    }
