package br.com.model;

import java.sql.Date;

public class Graduacao {

	private String nomeGraduação;
	private String instituicao;
	private Date ano_ingresso;
	private Date ano_conclusao;
	private float gra_media;
	
	public Graduacao(String nomeGraduação, String instituicao, Date ano_ingresso, Date ano_conclusao, float gra_media) {
		this.nomeGraduação = nomeGraduação;
		this.instituicao = instituicao;
		this.ano_ingresso = ano_ingresso;
		this.ano_conclusao = ano_conclusao;
		this.gra_media = gra_media;
	}

	public String getNomeGraduação() {
		return nomeGraduação;
	}

	public void setNomeGraduação(String nomeGraduação) {
		this.nomeGraduação = nomeGraduação;
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
