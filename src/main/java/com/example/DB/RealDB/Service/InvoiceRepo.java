package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.Invoice;
import com.example.DB.RealDB.Repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Service
@Transactional
public class InvoiceRepo {
    @Autowired
    private InvoiceRepository rp;

    public List<Invoice> getAll() {
        return rp.findAll();
    }

    public Invoice getByID(long id) {
        return rp.findById(id).get();
    }

    public Invoice add(Invoice b) {
        rp.save(b);
        return b;
    }

    public void delete(long id) {
        rp.deleteById(id);
    }

}

