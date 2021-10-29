package com.example.controller;

import com.example.DB.RealDB.BraceletOrder;
import com.example.DB.RealDB.BraceletProduct;
import com.example.DB.RealDB.Customer;
import com.example.DB.RealDB.Invoice;
import com.example.DB.RealDB.Service.CustomerRepo;
import com.example.DB.RealDB.Service.InvoiceRepo;
import com.example.DB.RealDB.Service.OrderRepo;
import com.example.DB.RealDB.Service.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private OrderRepo orp;
    @Autowired
    private ProductRepo pr;
    @Autowired
    private CustomerRepo cr;

    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE) //delController
    public String delete(@PathVariable long id) {
        orp.delete(id);
        return "ลบรายการสั่งซื้อรหัส " + id + " เรียบร้อย";
    }

    @GetMapping(value = "/show") //showall
    public List<BraceletOrder> show() {
        return orp.getAll();
    }

    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET) //delController
    public BraceletOrder show(@PathVariable long id) {
        return orp.getByID(id);

    }

    @PostMapping(path = "/add")
    public String insert(@RequestBody BraceletOrder c) {
        c.setB(pr.getByID(c.getCid()));
        c.setC(cr.getByID(c.getBid()));
        orp.add(c);
        return "เพิ่มรายการสั่งซื้อเรียบร้อย";

    }

    @PostMapping("/edit")
    public BraceletOrder edit(@RequestBody BraceletOrder c) {
        BraceletOrder b = orp.getByID(c.getId());
        b.setB(c.getB());
        b.setC(c.getC());
        return orp.add(b);
    }

}
