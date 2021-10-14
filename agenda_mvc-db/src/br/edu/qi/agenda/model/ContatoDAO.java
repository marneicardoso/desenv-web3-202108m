package br.edu.qi.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {

	public Boolean cadastrarContatoDAO(Contato contato) throws SQLException {
		// Instrução SQL para adicionar um registro no DB
		String sql =
			"INSERT INTO contato (nome, email, fone)" +
			"VALUES (?, ?, ?)";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interrogação
		statement.setString(1, contato.getNome());
		statement.setString(2, contato.getEmail());
		statement.setString(3, contato.getFone());
		
		// Executa a instrução no DB
		statement.execute();
		
		// Fecha Statement e conexão DB
		statement.close();
		conexaoDB.fecharConexao(conn);
		
		return true; // Retorna sucesso do registro
	}
}
