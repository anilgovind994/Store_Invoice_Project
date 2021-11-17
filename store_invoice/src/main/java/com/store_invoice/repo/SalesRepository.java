package com.store_invoice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.store_invoice.model.Sales;

public interface SalesRepository extends JpaRepository<Sales,String>{

}
