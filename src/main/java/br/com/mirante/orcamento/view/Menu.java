package br.com.mirante.orcamento.view;

import java.util.Scanner;

public abstract class Menu implements Funcionalidade {

	Scanner scanner = new Scanner(System.in);
	
	public void executar() {
		imprimirMenu();
		var opcaoSelecionada = scanner.next();
		
		while(!existe(opcaoSelecionada)) {
			System.out.println("A op��o � inv�lida, tente novamente.");
			imprimirMenu();
			opcaoSelecionada = scanner.next();
		}
		
		processarOpcaoSelecionada(opcaoSelecionada);
	}
	
	protected abstract void imprimirMenu();
	protected abstract boolean existe(String opcaoSelecionada);
	protected abstract void processarOpcaoSelecionada(String opcaoSelecionada);
}
