package com.example.DB.RealDB.Repository;

import com.example.DB.RealDB.BraceletProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BraceletRepository extends JpaRepository<BraceletProduct, String> {
}
