package br.com.model;

public class Disciplina {

 
	private String codigo;
	private String nome;
	private char autorizacao;
	
	public Disciplina(String codigo, String nome, char autorizacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.autorizacao = autorizacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getAutorizacao() {
		return autorizacao;
	}

	public void setAutorizacao(char autorizacao) {
		this.autorizacao = autorizacao;
	}
	
	

}
