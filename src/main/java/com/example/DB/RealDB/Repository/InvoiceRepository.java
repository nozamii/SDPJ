package com.example.DB.RealDB.Repository;

import com.example.DB.RealDB.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
