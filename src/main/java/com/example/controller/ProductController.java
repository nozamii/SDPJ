package com.example.controller;


import com.example.DB.RealDB.BraceletProduct;

import com.example.DB.RealDB.Service.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private ProductRepo prp;

    @GetMapping(value = "/show") //showall
    public List<BraceletProduct> show() {
        return prp.getAll();
    }

    @GetMapping(value = "/show/{id}")
    public BraceletProduct show(@PathVariable long id) {
        return prp.getByID(id);
    }

    @PostMapping("/add")
    public String insert(@RequestBody BraceletProduct b) {
        prp.add(b);
        return "เพิ่มสินค้าเรียบร้อย";
    }

    @DeleteMapping(value = "/del/{id}") //delController
    public String delete(@PathVariable long id) {
        prp.delete(id);
        return "ลบสินค้ารหัส " + id + " เรียบร้อย";
    }

    @PostMapping("/edit")
    public BraceletProduct edit(@RequestBody BraceletProduct c) {
        BraceletProduct b = prp.getByID(c.getId());
        b.setName(c.getName());
        b.setPrice(c.getPrice());
        b.setId(c.getId());
        return prp.add(b);
    }

}


