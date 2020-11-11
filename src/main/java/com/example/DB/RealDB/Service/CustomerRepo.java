package com.example.DB.RealDB.Service;

import com.example.DB.RealDB.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomerRepo{
    @PersistenceContext
    private EntityManager em;

    public boolean exists(int id) {
        return true;
    }

    @Transactional
    public Customer insert(Customer b){
        em.persist(b);
        return b;
    }
    public List<Customer> findAll(){
        Query q = em.createQuery("from Customer");
        return q.getResultList();
    }

    public Customer findbyID(String id){

        return em.find(Customer.class,id);
    }

    @Transactional
    public Customer save(Customer b){
        em.persist(b);
        return b;
    }
    @Transactional
    public void delete(String id){
        Customer b = em.find(Customer.class,id);
        em.remove(b);
    }


}