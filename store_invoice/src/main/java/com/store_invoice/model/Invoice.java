package com.store_invoice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "APP", name = "INVOICE")
public class Invoice {
	@Id
	
	@Column(name = "INVOICE_ID")
	private String invId;
	@Column(name = "INVOICE_DATE")
	private String invDt;

	public String getInvId() {
		return invId;
	}

	public void setInvId(String invId) {
		this.invId = invId;
	}

	public String getInvDt() {
		return invDt;
	}

	public void setInvDt(String invDt) {
		this.invDt = invDt;
	}
}
