package com.store_invoice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store_invoice.model.Sales;
import com.store_invoice.service.SalesService;
import com.store_invoice.repo.SalesRepository;

@Service
public class SalesServiceImpl implements SalesService{
	
	@Autowired
	SalesRepository salesRepo;
	
	@Override
	public List<Sales> getSalesData() {
		return salesRepo.findAll();
	}
	

}
