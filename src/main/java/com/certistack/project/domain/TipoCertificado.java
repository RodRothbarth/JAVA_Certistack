package com.certistack.project.domain;

public enum TipoCertificado {

	EXTRACURRICULAR(1, "Extracurricular"),
	EVENTO(2, "Evento"),
	OFICINA(3, "Oficina");
	
	private int cod;
	private String descricao;
	
	private TipoCertificado(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCertificado toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(TipoCertificado x : TipoCertificado.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
			
		throw new IllegalArgumentException("Id Invalido: " + cod);		
	}
}
