package com.certistack.project.dtos;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.certistack.project.domain.Estudante;

public class InstituicaoDTO {

	private Integer idUsuario;
	
	private String name;
	private String country;
	private String phone;
	
	private String email;
	
	private String senha;

	private String cnpj;
	private String departamento;
	private List<Estudante> estudantes = new ArrayList<>();
	
	public InstituicaoDTO() {
		
	}
	
	public InstituicaoDTO(Integer idUsuario, String name, String country, String phone, String email, String senha,
			String cnpj, String departamento, List<Estudante> estudantes) {
		super();
		this.idUsuario = idUsuario;
		this.name = name;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.senha = senha;
		this.cnpj = cnpj;
		this.departamento = departamento;
		this.estudantes = estudantes;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
	
	
	
}
