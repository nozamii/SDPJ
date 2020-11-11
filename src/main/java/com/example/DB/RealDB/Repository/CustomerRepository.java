package com.example.DB.RealDB.Repository;


import com.example.DB.RealDB.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
