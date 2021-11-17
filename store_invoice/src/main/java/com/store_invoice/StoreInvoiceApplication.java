package com.store_invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class StoreInvoiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(StoreInvoiceApplication.class, args);

	}

}
