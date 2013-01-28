package br.com.model;

import java.sql.Date;

public class Poscomp {

	private String identificacao;
	private Date ano;
	private float nota_matematica;
	private float nota_fundamentos;
	private float nota_tecnologia;
	
	
	public Poscomp(String identificacao, Date ano, float nota_matematica,float nota_fundamentos, float nota_tecnologia) {
		
		this.identificacao = identificacao;
		this.ano = ano;
		this.nota_matematica = nota_matematica;
		this.nota_fundamentos = nota_fundamentos;
		this.nota_tecnologia = nota_tecnologia;
	
	}


	public String getIdentificacao() {
		return identificacao;
	}


	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}


	public Date getAno() {
		return ano;
	}


	public void setAno(Date ano) {
		this.ano = ano;
	}


	public float getNota_matematica() {
		return nota_matematica;
	}


	public void setNota_matematica(float nota_matematica) {
		this.nota_matematica = nota_matematica;
	}


	public float getNota_fundamentos() {
		return nota_fundamentos;
	}


	public void setNota_fundamentos(float nota_fundamentos) {
		this.nota_fundamentos = nota_fundamentos;
	}


	public float getNota_tecnologia() {
		return nota_tecnologia;
	}


	public void setNota_tecnologia(float nota_tecnologia) {
		this.nota_tecnologia = nota_tecnologia;
	}

	
}
