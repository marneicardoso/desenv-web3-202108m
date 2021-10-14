package br.edu.qi.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {

	public Boolean cadastrarContatoDAO(Contato contato) throws SQLException {
		// Instru��o SQL para adicionar um registro no DB
		String sql =
			"INSERT INTO contato (nome, email, fone)" +
			"VALUES (?, ?, ?)";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interroga��o
		statement.setString(1, contato.getNome());
		statement.setString(2, contato.getEmail());
		statement.setString(3, contato.getFone());
		
		// Executa a instru��o no DB
		statement.execute();
		
		// Fecha Statement e conex�o DB
		statement.close();
		conexaoDB.fecharConexao(conn);
		
		return true; // Retorna sucesso do registro
	}
}
