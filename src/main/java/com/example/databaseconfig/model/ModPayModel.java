package com.example.databaseconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mod_Pay")
public class ModPayModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Mod_Id")
	private Integer modId;
	
	@Column(name="Mod_Payment")
	private Double modOfPayment;

	public Integer getModId() {
		return modId;
	}

	public void setModId(Integer modId) {
		this.modId = modId;
	}

	public Double getModOfPayment() {
		return modOfPayment;
	}

	public void setModOfPayment(Double modOfPayment) {
		this.modOfPayment = modOfPayment;
	}
	
	

}
