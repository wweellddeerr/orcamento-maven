package br.com.mirante.orcamento.view;

import java.util.stream.Stream;

public class MenuDetalharOrcamentoUI extends Menu {

	protected void processarOpcaoSelecionada(String opcaoSelecionada) {
		System.out.println("A opção selecionada foi " + opcaoSelecionada);
		OpcoesMenuDetalharOrcamento.get(opcaoSelecionada).executar();
	}

	protected void imprimirMenu() {
		System.out.println("Digite o número correspondente à opção desejada:");
		Stream.of(OpcoesMenuDetalharOrcamento.values()).forEach(OpcoesMenuDetalharOrcamento::exibir);
	}

	@Override
	protected boolean existe(String opcaoSelecionada) {
		return OpcoesMenuDetalharOrcamento.existe(opcaoSelecionada);
	}


}
