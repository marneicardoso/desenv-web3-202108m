package br.edu.qi.agenda.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	// Abre a conex�o com o DB
	public Connection abrirConexao() throws SQLException {
		// Atributos da conex�o
		String servidor = "localhost";
		String porta = ":3307";
		String nomeDB = "agenda_db";
		String usuario = "root";
		String senha = "";
		
		// Monta a URL de conex�o
		String url = "jdbc:mysql://" + servidor + porta + "/" + nomeDB;
				   // jdbc:mysql://localhost:3307/agenda_db
		
		// Interface de conex�o com o DB
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		return conn;
	}
	
	// Fecha a conex�o com o DB
	public void fecharConexao(Connection conexaoAberta) throws SQLException {
		conexaoAberta.close();
	}
}














