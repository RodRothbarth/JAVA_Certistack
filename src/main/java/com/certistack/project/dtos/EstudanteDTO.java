package com.certistack.project.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import com.certistack.project.domain.Certificados;
import com.certistack.project.domain.Instituicao;


public class EstudanteDTO  implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idUsuario;
	
	private String name;
	private String country;
	private String phone;

	private String email;

	private String senha;
	
	private String cpf;
	private String areaEducacao;
	private String lattes;
	private Integer hours;
	private List<Certificados> certificados = new ArrayList<>();

	private Instituicao instituicao;
	
	public EstudanteDTO() {
		
	}
	
	public EstudanteDTO(Integer idUsuario, String name, String country, String phone, String email, String senha,
			String cpf, String areaEducacao, String lattes, Integer hours, List<Certificados> certificados,
			Instituicao instituicao) {
		super();
		this.idUsuario = idUsuario;
		this.name = name;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.areaEducacao = areaEducacao;
		this.lattes = lattes;
		this.hours = hours;
		this.certificados = certificados;
		this.instituicao = instituicao;
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
	
	
	
}
