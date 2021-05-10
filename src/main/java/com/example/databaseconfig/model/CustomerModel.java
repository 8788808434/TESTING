package com.example.databaseconfig.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class CustomerModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Customerid")
	private Integer customerId;
	
	@Column(name="Customer_Name")
	private String customerName;
	
	@Column(name="Cust_Address")
	private String customerAddress;
	
	@Column(name="Cust_Number")
	private String customerNumber;
	
	@JoinColumn(name="Agency_Id")
	@OneToOne(cascade=CascadeType.ALL)
	private AgencyModel agency;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public AgencyModel getAgency() {
		return agency;
	}

	public void setAgency(AgencyModel agency) {
		this.agency = agency;
	}

	
}
