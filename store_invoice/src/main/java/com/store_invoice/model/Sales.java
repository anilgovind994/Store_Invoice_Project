package com.store_invoice.model;
import javax.persistence.*;
@Entity
@Table(schema = "APP ",name ="SALES")
public class Sales {
	@Id
	@Column(name="PRODUCT_ID")
	private String proId;
	
	@Column(name="ITEM")
	private String item; 
	
	@Column(name="PURCHASE")
	private String purchase;

	
	@Column(name="SALE")
	private String sale;

	
	@Column(name="PROFIT")
	private String profit;


	public String getProId() {
		return proId;
	}


	public void setProId(String proId) {
		this.proId = proId;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getPurchase() {
		return purchase;
	}


	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}


	public String getSale() {
		return sale;
	}


	public void setSale(String sale) {
		this.sale = sale;
	}


	public String getProfit() {
		return profit;
	}


	public void setProfit(String profit) {
		this.profit = profit;
	}
	


}
