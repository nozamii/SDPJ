package com.example.DB.RealDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String Oid;
    private String cid;
    private Date date;

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }

    public String getOid() { return Oid; }
    public void setOid(String oid) { Oid = oid; }

    public String getCid() { return cid; }
    public void setCid(String cid) { this.cid = cid; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }


}
