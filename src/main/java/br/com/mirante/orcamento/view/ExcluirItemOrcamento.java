package br.com.mirante.orcamento.view;

import java.util.Scanner;

import br.com.mirante.orcamento.servico.ServicoExcluirItem;

public class ExcluirItemOrcamento implements Funcionalidade {
	private Scanner scanner = new Scanner(System.in);
	private ServicoExcluirItem servico = new ServicoExcluirItem();

	@Override
	public void executar() {
		System.out.println("Digite o código do item que deseja excluir: ");
		Integer codigoItem = scanner.nextInt();
		servico.excluirItem(codigoItem);
		System.out.println("OK.");
		new MenuDetalharOrcamentoUI().executar();
	}

}
