package com.example.DB.RealDB;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity

public class BraceletOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long bid;
    private long cid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private BraceletProduct b;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Customer c;

    @CreationTimestamp
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateorder;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public BraceletProduct getB() {
        return b;
    }

    public void setB(BraceletProduct b) {
        this.b = b;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public LocalDateTime getDateorder() {
        return dateorder;
    }

    public void setDateorder(LocalDateTime dateorder) {
        this.dateorder = dateorder;
    }


    public BraceletOrder(long oid, BraceletProduct bb, Customer cc, double p) {
        this.id = oid;
        this.b = bb;
        this.c = cc;

    }

    public BraceletOrder() {

    }


}
