package br.edu.qi.agenda.model;

import java.sql.SQLException;

import br.edu.qi.agenda.view.Tela;

public class Agenda {

	// Métodos
	public void iniciarAgenda() throws SQLException {
		// Cria o objeto da classe Tela
		Tela tela = new Tela();

		// Monta o Menu
		String menu = ":: Agenda de Contatos ::\n\n" +
				"1. Cadastrar\n" +
				"2. Buscar\n" +
				"3. Editar\n" +
				"4. Excluir\n\n";

		// Mantém o Menu ativo
		boolean isAtivo = true;

		// Loop Principal do Sistema
		while (isAtivo) {
			String opcao = tela.informar(menu, "Informe uma das opções", -1);

			switch (opcao) {
			case "1":
				cadastrarContato(tela);
				break;

			case "2":
				//buscarContato(tela);
				break;

			case "3":
				//editarContato(tela);
				break;

			case "4":
				//excluirContato(tela);
				break;

			default:
				int sair = tela.confirmar("Deseja sair?", "Encerrar Sistema", 3);

				// Sim == 0 | Não == 1
				if (sair == 0) {
					isAtivo = false;
					tela.mostrar("Encerrando o Sistema...", "Encerrar Sistema", 1);
				}
			} // fecha o switch
		} // fecha o while
	} // fecha o método iniciarAgenda()

	private void cadastrarContato(Tela tela) throws SQLException {

		// Usuário informa os dados de cadastro
		String nome = tela.informar("Informe o Nome", "Nome", 1);
		String email = tela.informar("Informe o E-mail", "E-mail", 1);
		String fone = tela.informar("Informe o Telefone", "Fone", 1);

		// Cria o objeto da classe Contato
		Contato contato = new Contato(nome, email, fone);

		// Envia o Contato (preenchido) para o Banco de Dados
		ContatoDAO dao = new ContatoDAO();
		boolean cadastrou = dao.cadastrarContatoDAO(contato);
		
		if (cadastrou) {
			tela.mostrar("Cadastro efetuado com sucesso!", "Cadastro", 1);
		
		} else {
			tela.mostrar("Erro ao cadastrar o Contato", "Cadastro", 0);
		}
		
	} // fecha o método cadastrarContato()
}







