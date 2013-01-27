package br.com.model;

import java.util.Calendar;

public class AlunoEspecial extends Aluno{
	
	private String comentario;

	public AlunoEspecial(Long id, String nome, Calendar dt_nascimento, String telefone1,
			String telefone2, String naturalidade, String nacionalidade,
			String estado, String email, String comentario) {
		super(id, nome, dt_nascimento, telefone1, telefone2, naturalidade, nacionalidade, estado, email);
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		
		this.comentario = comentario;
	}

}
