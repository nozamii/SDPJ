package com.example.controller;

import com.example.DB.RealDB.BraceletProduct;
import com.example.DB.RealDB.Service.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ProductRepo repo;

    @RequestMapping("/say")
    public List<BraceletProduct> sayHi(){
      List<BraceletProduct> bralist = repo.findAll();
      for(BraceletProduct b : bralist){
           System.out.println(b.getName());
       }
        return bralist;
    }
    @RequestMapping(value = "/cosmetics/{id}",method= RequestMethod.DELETE)
    public void gg(@PathVariable String id) {
        repo.delete(id);
        System.out.println("ลบละ");
    }

    public String insertproduct(@ModelAttribute BraceletProduct b, Model mo ){
        repo.insert(b);
        return "/home";
    }
}
