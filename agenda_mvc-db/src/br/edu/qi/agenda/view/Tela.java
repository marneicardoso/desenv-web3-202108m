package br.edu.qi.agenda.view;

import javax.swing.JOptionPane;

public class Tela {

	public void mostrar(String mensagem, String titulo, int icone) {
		JOptionPane.showMessageDialog(
				null,		// Componente pai
				mensagem,	// Mensagem no modal
				titulo,		// T�tulo da janela
				icone);		// �cone no modal
		
		/*
		-1	Plane (sem �cone)
		0	Error
		1	Information
		2	Warning
		3	Question
		*/
	}
	
	public String informar(String mensagem, String titulo, int icone) {
		return JOptionPane.showInputDialog(
				null,
				mensagem,
				titulo,
				icone);
	}
	
	public int confirmar(String mensagem, String titulo, int icone) {
		return JOptionPane.showConfirmDialog(
				null,
				mensagem,
				titulo,
				JOptionPane.YES_NO_OPTION,
				icone);
	}
}





