package br.com.model;

import java.sql.Date;

public class Graduacao {

	private String nomeGradua��o;
	private String instituicao;
	private Date ano_ingresso;
	private Date ano_conclusao;
	private float gra_media;
	
	public Graduacao(String nomeGradua��o, String instituicao, Date ano_ingresso, Date ano_conclusao, float gra_media) {
		this.nomeGradua��o = nomeGradua��o;
		this.instituicao = instituicao;
		this.ano_ingresso = ano_ingresso;
		this.ano_conclusao = ano_conclusao;
		this.gra_media = gra_media;
	}

	public String getNomeGradua��o() {
		return nomeGradua��o;
	}

	public void setNomeGradua��o(String nomeGradua��o) {
		this.nomeGradua��o = nomeGradua��o;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Date getAno_ingresso() {
		return ano_ingresso;
	}

	public void setAno_ingresso(Date ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}

	public Date getAno_conclusao() {
		return ano_conclusao;
	}

	public void setAno_conclusao(Date ano_conclusao) {
		this.ano_conclusao = ano_conclusao;
	}

	public float getGra_media() {
		return gra_media;
	}

	public void setGra_media(float gra_media) {
		this.gra_media = gra_media;
	}
	
	
}
