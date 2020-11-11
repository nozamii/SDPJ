package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.BraceletOrder;
import org.springframework.transaction.annotation.Transactional;


import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class OrderRepo {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public BraceletOrder insert(BraceletOrder b){
        em.persist(b);
        return b;
    }
    public List<BraceletOrder> findAll(){
        Query q = em.createQuery("from Order");
        return q.getResultList();
    }

    public BraceletOrder findbyID(String id){

        return em.find(BraceletOrder.class,id);
    }

    @Transactional
    public BraceletOrder save(BraceletOrder b){
        em.persist(b);
        return b;
    }
    @Transactional
    public void delete(String id){
        BraceletOrder b = em.find(BraceletOrder.class,id);
        em.remove(b);
    }



}
