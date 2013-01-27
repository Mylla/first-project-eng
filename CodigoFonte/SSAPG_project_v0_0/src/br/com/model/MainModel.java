package br.com.model;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.jdbc.ConnectionFactory;

public class MainModel {
	
	public void main() throws SQLException
	{
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("conexão aberta!");
		connection.close();
	}
}
