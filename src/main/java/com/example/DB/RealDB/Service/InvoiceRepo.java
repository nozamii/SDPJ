package com.example.DB.RealDB.Service;
import com.example.DB.RealDB.Invoice;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class InvoiceRepo {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Invoice insert(Invoice b){
        em.persist(b);
        return b;
    }
    public List<Invoice> findAll(){
        Query q = em.createQuery("from Invoice");
        return q.getResultList();
    }

    public Invoice findbyID(String id){

        return em.find(Invoice.class,id);
    }

    @Transactional
    public Invoice save(Invoice b){
        em.persist(b);
        return b;
    }
    @Transactional
    public void delete(String id){
        Invoice b = em.find(Invoice.class,id);
        em.remove(b);
    }


}

