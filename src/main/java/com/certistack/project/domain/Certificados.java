 package com.certistack.project.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Certificados implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCertificado;
	private String eventName;
	private Integer hours;
	private String country;
	private String city;
	private String idealizer;
	private String beginData;
	private String endDate;
	private Boolean validation; 
	@Enumerated(EnumType.ORDINAL)
	private TipoCertificado type;
	@ManyToOne
	@JoinColumn(name="estudante_id")
	private Estudante estudante;
	
	public Certificados() {
		
	}

	public Certificados(Integer idCertificado, String eventName, Integer hours, String country, String city,
			String idealizer, String beginData, String endDate, Boolean validation, TipoCertificado type,
			Estudante estudante) {
		super();
		this.idCertificado = idCertificado;
		this.eventName = eventName;
		this.hours = hours;
		this.country = country;
		this.city = city;
		this.idealizer = idealizer;
		this.beginData = beginData;
		this.endDate = endDate;
		this.validation = validation;
		this.type = type;
		this.estudante = estudante;
	}



	public TipoCertificado getType() {
		return type;
	}

	public void setType(TipoCertificado type) {
		this.type = type;
	}

	

	public Integer getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(Integer idCertificado) {
		this.idCertificado = idCertificado;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	public String getBeginData() {
		return beginData;
	}

	public void setBeginData(String beginData) {
		this.beginData = beginData;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public Boolean getValidation() {
		return validation;
	}

	public void setValidation(Boolean validation) {
		this.validation = validation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCertificado);
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
		return Objects.equals(idCertificado, other.idCertificado);
	};
	
	
	
	
}
