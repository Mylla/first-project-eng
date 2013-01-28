package br.com.model;

import java.sql.Date;

public class Curso {

	private String nomeCurso;
	private String instituicao;
	private Date ano_curso;
	private float carga_horaria;
	
	public Curso(String nomeCurso, String instituicao, Date ano_curso,float carga_horaria){
		this.nomeCurso = nomeCurso;
		this.instituicao = instituicao;
		this.ano_curso = ano_curso;
		this.carga_horaria = carga_horaria;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Date getAno_curso() {
		return ano_curso;
	}

	public void setAno_curso(Date ano_curso) {
		this.ano_curso = ano_curso;
	}

	public float getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(float carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
	
}
