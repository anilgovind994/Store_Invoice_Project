package com.store_invoice.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store_invoice.model.Sales;
import com.store_invoice.service.SalesService;

@RestController
public class SalesController {
	@Autowired
	SalesService salesService;
	
	@RequestMapping({"/","/sales"})
	public List<Sales> getSales(){
		return salesService.getSalesData();
		
	}

}
