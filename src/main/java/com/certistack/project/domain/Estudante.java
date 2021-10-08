package com.certistack.project.domain;

import java.util.Objects;

public class Estudante extends Usuarios {
	private static final long serialVersionUID = 1L;

	private String cpf;
	private String areaEducacao;
	private String lattes;
	
	public Estudante() {};
	
	public Estudante(String cpf, String areaEducacao, String lattes) {
		super();
		this.cpf = cpf;
		this.areaEducacao = areaEducacao;
		this.lattes = lattes;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(areaEducacao, cpf, lattes);
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
		return Objects.equals(areaEducacao, other.areaEducacao) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(lattes, other.lattes);
	}
	
	
	
}
