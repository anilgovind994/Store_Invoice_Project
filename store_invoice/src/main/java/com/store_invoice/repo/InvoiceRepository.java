package com.store_invoice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store_invoice.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {
	//public List<Invoice> findByinvId(String invId);
}