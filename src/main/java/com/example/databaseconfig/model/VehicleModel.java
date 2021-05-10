package com.example.databaseconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vechicles")
public class VehicleModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Vechicle_Id")
	private Integer vechicleId;
	
	@Column(name="Vechicle_Name")
	private String vechicleName;

	public Integer getVechicleId() {
		return vechicleId;
	}

	public void setVechicleId(Integer vechicleId) {
		this.vechicleId = vechicleId;
	}

	public String getVechicleName() {
		return vechicleName;
	}

	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}
	
	
}
