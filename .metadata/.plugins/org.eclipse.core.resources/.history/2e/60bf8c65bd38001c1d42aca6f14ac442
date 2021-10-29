package com.example.controller;

import com.example.DB.RealDB.Customer;
import com.example.DB.RealDB.Service.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    @Autowired
    private CustomerRepo crp;

    @DeleteMapping(value = "/del/{id}") //delController
    public String delete(@PathVariable long id) {
        crp.delete(id);
        return "ลบลูกค้ารหัส " + id + " เรียบร้อย";
    }

    @GetMapping(value = "/show") //showall
    public List<Customer> show() {
        return crp.getAll();
    }

    @GetMapping(value = "/show/{id}") //delController
    public Customer show(@PathVariable long id) {
        return crp.getByID(id);
    }

    @PostMapping(path="/add")
    public String insert(@RequestBody Customer b) {
        crp.add(b);
        return "เพิ่มลูกค้าเรียบร้อย";
    }
    @PostMapping("/edit")
    public void edit(@RequestBody Customer c){
        Customer ec = crp.getByID(c.getId());
        ec.setName(c.getName());
        ec.setCtell(c.getCtell());
        ec.setAddress(c.getAddress());
        ec.setId(c.getId());
        crp.add(ec);
    }

}
