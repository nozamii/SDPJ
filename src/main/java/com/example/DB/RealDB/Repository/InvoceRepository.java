package com.example.DB.RealDB.Repository;

import com.example.DB.RealDB.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoceRepository extends JpaRepository<Invoice, String> {
}
