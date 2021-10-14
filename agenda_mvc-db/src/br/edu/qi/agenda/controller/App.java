package br.edu.qi.agenda.controller;

import java.sql.SQLException;

import br.edu.qi.agenda.model.Agenda;

public class App {

	public static void main(String[] args) throws SQLException {
		Agenda agenda = new Agenda();
		agenda.iniciarAgenda();
	}
}
