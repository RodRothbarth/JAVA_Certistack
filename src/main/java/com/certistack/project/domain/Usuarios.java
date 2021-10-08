package com.certistack.project.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer hours;
	private String country;
	private String phone;
	private String email;
	private String areaEducacao;
	
	public Usuarios() {}
	
	public Usuarios(Integer id, String name, Integer hours, String country, String phone, String email,
			String areaEducacao) {
		super();
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.areaEducacao = areaEducacao;
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAreaEducacao() {
		return areaEducacao;
	}

	public void setAreaEducacao(String areaEducacao) {
		this.areaEducacao = areaEducacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(areaEducacao, country, email, hours, id, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(areaEducacao, other.areaEducacao) && Objects.equals(country, other.country)
				&& Objects.equals(email, other.email) && Objects.equals(hours, other.hours)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	
	
	
	
	

}
