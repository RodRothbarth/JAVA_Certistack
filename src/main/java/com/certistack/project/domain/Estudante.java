package com.certistack.project.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="estudante")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Estudante extends Usuarios {
	private static final long serialVersionUID = 1L;

	private String cpf;
	private String areaEducacao;
	private String lattes;
	private Integer hours;
	
	@OneToMany(mappedBy = "estudante", cascade=CascadeType.ALL)
	private List<Certificados> certificados = new ArrayList<>();
	
	
	@ManyToOne
	@JoinColumn(name="instituicao")
	private Instituicao instituicao;
	
	public Estudante() {
		addRole(Roles.ESTUDANTE);
	}

	public Estudante(String cpf, String areaEducacao, String lattes, Integer hours, 
			Instituicao instituicao) {
		super();
		this.cpf = cpf;
		this.areaEducacao = areaEducacao;
		this.lattes = lattes;
		this.hours = hours;
		this.instituicao = instituicao;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAreaEducacao() {
		return areaEducacao;
	}

	public void setAreaEducacao(String areaEducacao) {
		this.areaEducacao = areaEducacao;
	}

	public String getLattes() {
		return lattes;
	}

	public void setLattes(String lattes) {
		this.lattes = lattes;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public List<Certificados> getCertificados() {
		return certificados;
	}

	public void setCertificados(List<Certificados> certificados) {
		this.certificados = certificados;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(areaEducacao, certificados, cpf, hours, instituicao, lattes);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		return Objects.equals(areaEducacao, other.areaEducacao) && Objects.equals(certificados, other.certificados)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(hours, other.hours)
				&& Objects.equals(instituicao, other.instituicao) && Objects.equals(lattes, other.lattes);
	}

	

	
	
	
	
	
	
	
}
