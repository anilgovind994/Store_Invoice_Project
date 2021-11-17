package com.store_invoice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store_invoice.model.Invoice;
import com.store_invoice.repo.InvoiceRepository;
import com.store_invoice.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	@Autowired
	InvoiceRepository invRepo;

//	@Override
	// public List<Invoice> getInvoiceDataByInvId(String invId) {
	// return invRepo.findByinvId(invId);
	// }

	@Override
	public List<Invoice> getInvoiceData() {
		return invRepo.findAll();
	}
}