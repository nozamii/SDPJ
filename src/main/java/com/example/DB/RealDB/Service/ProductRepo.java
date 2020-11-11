package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.BraceletProduct;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductRepo {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public BraceletProduct insert(BraceletProduct b){
        em.persist(b);
        return b;
    }
    public List<BraceletProduct> findAll(){
        Query q = em.createQuery("from BraceletProduct");
        return q.getResultList();
    }

    public BraceletProduct findbyID(String id){
        return em.find(BraceletProduct.class,id);
    }

    @Transactional
    public BraceletProduct save(BraceletProduct b){
        em.persist(b);
        return b;
    }
    @Transactional
    public void delete(String id){
        BraceletProduct b = em.find(BraceletProduct.class,id);
        em.remove(b);
    }


}
