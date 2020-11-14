package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.BraceletOrder;
import com.example.DB.RealDB.BraceletProduct;
import com.example.DB.RealDB.Customer;
import com.example.DB.RealDB.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Service
@Transactional
public class OrderRepo {

    @Autowired
    private OrderRepository rp;

    public List<BraceletOrder> getAll() {
        return rp.findAll();
    }

    public BraceletOrder getByID(long id) {
        return rp.findById(id).get();
    }

    public BraceletOrder add(BraceletOrder b) {
      return  rp.save(b);
    }

    public void delete(long id) {
        rp.deleteById(id);
    }

}
