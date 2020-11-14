package com.example.DB.RealDB.Repository;


import com.example.DB.RealDB.Customer;
import com.example.DB.RealDB.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
