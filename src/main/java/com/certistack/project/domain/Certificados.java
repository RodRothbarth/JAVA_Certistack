 package com.certistack.project.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Certificados implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String eventName;
	private String hours;
	private String country;
	private String city;
	private String idealizer;
	private Date beginData;
	private Date endDate;
	private Boolean validation; 
	
	public Boolean getValidation() {
		return validation;
	}

	public void setValidation(Boolean validation) {
		this.validation = validation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Certificados() {}

	public Certificados(String id, String eventName, String hours, String country, String city, String idealizer,
			Date beginData, Date endDate, Boolean validation) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.hours = hours;
		this.country = country;
		this.city = city;
		this.idealizer = idealizer;
		this.beginData = beginData;
		this.endDate = endDate;
		this.validation = validation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIdealizer() {
		return idealizer;
	}

	public void setIdealizer(String idealizer) {
		this.idealizer = idealizer;
	}

	public Date getBeginData() {
		return beginData;
	}

	public void setBeginData(Date beginData) {
		this.beginData = beginData;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Certificados other = (Certificados) obj;
		return Objects.equals(id, other.id);
	};
	
}
