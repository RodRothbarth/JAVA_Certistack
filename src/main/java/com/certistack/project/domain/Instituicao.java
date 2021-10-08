package com.certistack.project.domain;

import java.util.Objects;

public class Instituicao extends Usuarios{
	private static final long serialVersionUID = 1L;
	
	private String cnpj;
	private String departamento;
	
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cnpj, departamento);
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
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(departamento, other.departamento);
	};
	
}
