package com.example.databaseconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agency")
public class AgencyModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Agency_Id")
	private Integer agencyId;
	
	@Column(name="Agency_Loc")
	private String agencyLocation;

	public Integer getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgencyLocation() {
		return agencyLocation;
	}

	public void setAgencyLocation(String agencyLocation) {
		this.agencyLocation = agencyLocation;
	}
	
	

}
