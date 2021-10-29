package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.BraceletProduct;
import com.example.DB.RealDB.Customer;
import com.example.DB.RealDB.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Service
@Transactional
public class CustomerRepo {
    @Autowired
    private CustomerRepository rp;


    public List<Customer> getAll() {
        return rp.findAll();
    }

    public Customer getByID(long id) {
        return rp.findById(id).get();
    }

    public void add(Customer b) {
        rp.save(b);
    }

    public void delete(long id) {
        rp.deleteById(id);
    }


}