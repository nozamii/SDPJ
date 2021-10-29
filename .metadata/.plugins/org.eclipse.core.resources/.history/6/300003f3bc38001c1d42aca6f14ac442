package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.BraceletProduct;
import com.example.DB.RealDB.Customer;
import com.example.DB.RealDB.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Service
@Transactional
public class ProductRepo {
    @Autowired
    private ProductRepository pr;

    public List<BraceletProduct> getAll() {
        return pr.findAll();
    }

    public BraceletProduct getByID(long id) {
        return pr.findById(id).get();
    }

    public BraceletProduct add(BraceletProduct b) {
        return  pr.save(b);
    }

    public void delete(long id) {
        pr.deleteById(id);
    }

}
