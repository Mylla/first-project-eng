package br.com.model;

import java.util.Calendar;

public class Aluno {
	
	//Atributos
	private Long id;
	private String nome;
	private Calendar dt_nascimento;
	private String telefone1;
	private String telefone2;
	private String naturalidade;
	private String nacionalidade; 
	private String estado; 
	private String email; 
	
	
	//Construtor
	public Aluno( Long id, String nome, Calendar dt_nascimento, String telefone1,
			String telefone2, String naturalidade, String nacionalidade,
			String estado, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
		this.estado = estado;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
