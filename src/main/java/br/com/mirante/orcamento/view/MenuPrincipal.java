package br.com.mirante.orcamento.view;

import java.util.stream.Stream;

public class MenuPrincipal extends Menu {

	protected void processarOpcaoSelecionada(String opcaoSelecionada) {
		System.out.println("A op??o selecionada foi " + opcaoSelecionada);
		OpcoesMenuPrincipal.get(opcaoSelecionada).executar();
	}

	protected void imprimirMenu() {
		System.out.println("Digite o n?mero correspondente ? op??o desejada:");
		Stream.of(OpcoesMenuPrincipal.values()).forEach(OpcoesMenuPrincipal::exibir);
	}

	@Override
	protected boolean existe(String opcaoSelecionada) {
		return OpcoesMenuPrincipal.existe(opcaoSelecionada);
	}


}
