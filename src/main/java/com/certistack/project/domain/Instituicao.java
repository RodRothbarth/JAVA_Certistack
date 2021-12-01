package com.certistack.project.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Instituicao extends Usuarios{
	private static final long serialVersionUID = 1L;
	
	private String cnpj;
	private String departamento;
	@OneToMany(mappedBy = "instituicao", cascade=CascadeType.ALL)
	@JsonBackReference
	private List<Estudante> estudantes = new ArrayList<>();
	
	public Instituicao() {}

	public Instituicao(String cnpj, String departamento) {
		super();
		this.cnpj = cnpj;
		this.departamento = departamento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cnpj, departamento, estudantes);
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
		Instituicao other = (Instituicao) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(departamento, other.departamento)
				&& Objects.equals(estudantes, other.estudantes);
	}

}
