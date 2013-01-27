package br.com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.jdbc.ConnectionFactory;
import br.com.model.Aluno;

public class AlunoDAO {
	
	private Connection connection;
	
	public AlunoDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Aluno aluno){
		String sql = "insert into alu_aluno values (?,?,?,?,?,?,?,?,?)";
		
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			//seta os valores
			stmt.setLong(1, aluno.getId());
			//falta o restos
			
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
