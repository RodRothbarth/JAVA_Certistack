package com.certistack.project.domain;

public enum Roles {

	SCHOOL(0, "ROLE_SCHOOL"),
	ESTUDANTE(1, "ROLE_STUDENT");
	
	private int cod;
	private String descricao;
	
	private Roles(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Roles toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(Roles x : Roles.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
			
		throw new IllegalArgumentException("Id Invalido: " + cod);		
	}
}
