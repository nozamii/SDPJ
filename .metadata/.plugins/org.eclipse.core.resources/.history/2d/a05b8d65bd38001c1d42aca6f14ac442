package com.example.controller;

import com.example.DB.RealDB.BraceletOrder;
import com.example.DB.RealDB.Invoice;
import com.example.DB.RealDB.Service.InvoiceRepo;
import com.example.DB.RealDB.Service.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Invoice")
public class InvoiceController {
    @Autowired
    private InvoiceRepo irp;
    @Autowired
    private OrderRepo or;

    @DeleteMapping(value = "/del/{id}")
    public String delete(@PathVariable long id) {
        irp.delete(id);
        return "ลบใบเสร็จรหัส " + id + " เรียบร้อย";
    }

    @GetMapping(value = "/show") //showall
    public List<Invoice> show() {
        return irp.getAll();
    }

    @GetMapping(value = "/show/{id}")
    public Invoice show(@PathVariable long id) {
        return irp.getByID(id);
    }

    @PostMapping(path = "/add")
    public String insert(@RequestBody Invoice c) {
        c.setO(or.getByID(c.getOid()));
        c.setDate(c.getDate());
        irp.add(c);
        return "เพิ่มใบเสร็จสั่งซื้อเรียบร้อย";

    }
    @PostMapping("/edit")
    public Invoice edit(@RequestBody Invoice c) {
        Invoice b = irp.getByID(c.getId());
        b.setId(c.getId());
        b.setOid(c.getOid());
        b.setO(or.getByID(c.getOid()));
        b.setDate(c.getDate());
        return irp.add(b);
    }

}
