package com.example.databaseconfig.model;

import java.util.Date;

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
@Table(name="Rentals")
public class RentalsModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Rental_Id")
	private Integer rentalId;
	
	@Column(name="Rent_Srt_Date")
	private Date rentStartDate;
	
	@Column(name="Rent_Ret_Date")
	private Date rentReturnDate;
	
	@JoinColumn(name="Agency_Id")
	@OneToOne(cascade=CascadeType.ALL)
	private AgencyModel agency;
	
	@JoinColumn(name="Customerid")
	@OneToOne(cascade=CascadeType.ALL)
	private CustomerModel customer;

	public Integer getRentalId() {
		return rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	public Date getRentStartDate() {
		return rentStartDate;
	}

	public void setRentStartDate(Date rentStartDate) {
		this.rentStartDate = rentStartDate;
	}

	public Date getRentReturnDate() {
		return rentReturnDate;
	}

	public void setRentReturnDate(Date rentReturnDate) {
		this.rentReturnDate = rentReturnDate;
	}

	public AgencyModel getAgency() {
		return agency;
	}

	public void setAgency(AgencyModel agency) {
		this.agency = agency;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	
	
	
	
}
