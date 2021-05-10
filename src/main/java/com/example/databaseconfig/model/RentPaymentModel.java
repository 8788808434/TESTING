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
@Table(name="Rent_Payment")
public class RentPaymentModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rent_paymentid")
	private Integer rentPaymentId ;
	
	@Column(name="payment")
	private String payment;
	
	@JoinColumn(name="Rental_Id")
	@OneToOne(cascade=CascadeType.ALL)
	private RentalsModel rentals;
	
	@JoinColumn(name="Customerid")
	@OneToOne(cascade=CascadeType.ALL)
	private CustomerModel customer;
	
	@JoinColumn(name="Mod_Id")
	@OneToOne(cascade=CascadeType.ALL)
	private ModPayModel modPay;

	public Integer getRentPaymentId() {
		return rentPaymentId;
	}

	public void setRentPaymentId(Integer rentPaymentId) {
		this.rentPaymentId = rentPaymentId;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public RentalsModel getRentals() {
		return rentals;
	}

	public void setRentals(RentalsModel rentals) {
		this.rentals = rentals;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}

	public ModPayModel getModPay() {
		return modPay;
	}

	public void setModPay(ModPayModel modPay) {
		this.modPay = modPay;
	}
	
	
}
