package br.com.model;

import java.sql.Blob;
import java.util.Calendar;

public class AlunoRegular extends Aluno {

	private String rg;
	private String cpf;
	private Blob foto;
	private String endereco;
	private String cep;
	private String cidade;
	private String dedicacao;
	private float horas_semanais;
	private String necessidade_bolsa;
	
	
	public AlunoRegular(Long id, String nome, Calendar dt_nascimento,
			String telefone1, String telefone2, String naturalidade,
			String nacionalidade, String estado, String email, String rg,
			String cpf, Blob foto, String endereco, String cep, String cidade,
			String dedicacao, float horas_semanais, String necessidade_bolsa) {
		super(id, nome, dt_nascimento, telefone1, telefone2, naturalidade,
				nacionalidade, estado, email);
		this.rg = rg;
		this.cpf = cpf;
		this.foto = foto;
		this.endereco = endereco;
		this.cep = cep;
		this.cidade = cidade;
		this.dedicacao = dedicacao;
		this.horas_semanais = horas_semanais;
		this.necessidade_bolsa = necessidade_bolsa;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Blob getFoto() {
		return foto;
	}


	public void setFoto(Blob foto) {
		this.foto = foto;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getDedicacao() {
		return dedicacao;
	}


	public void setDedicacao(String dedicacao) {
		this.dedicacao = dedicacao;
	}


	public float getHoras_semanais() {
		return horas_semanais;
	}


	public void setHoras_semanais(float horas_semanais) {
		this.horas_semanais = horas_semanais;
	}


	public String getNecessidade_bolsa() {
		return necessidade_bolsa;
	}


	public void setNecessidade_bolsa(String necessidade_bolsa) {
		this.necessidade_bolsa = necessidade_bolsa;
	}
	
      	
	
}
