package com.store_invoice.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store_invoice.model.Invoice;
import com.store_invoice.service.InvoiceService;

@RestController
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;

	@RequestMapping({ "/" ,"/invoice"})
	public List<Invoice> getInvoice() {
		return invoiceService.getInvoiceData();
	}

}