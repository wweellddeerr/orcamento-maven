package br.com.mirante.orcamento.view;

import java.util.Scanner;

import br.com.mirante.orcamento.domain.ItemOrcamento;
import br.com.mirante.orcamento.servico.DetalharOrcamentoServico;

public class DetalharOrcamentoUI implements Funcionalidade {

	private Scanner scanner = new Scanner(System.in);
	private DetalharOrcamentoServico servico = new DetalharOrcamentoServico();
	
	public void executar() {
		System.out.println("Digite o código do orçamento:");
		int id = scanner.nextInt();
		var orcamentoRecuperado = servico.recuperarOrcamento(id);
		if(orcamentoRecuperado == null) {
			System.out.println("Não há orçamento com o código " + id);
		} else {
			UIUtils.exibirOrcamento(orcamentoRecuperado);
			System.out.println("Itens:");
			for(ItemOrcamento i : orcamentoRecuperado.getItensOrcamento()) {
				UIUtils.exibirItemOrcamento(i);
			}
		}
		new MenuDetalharOrcamentoUI().executar();
	}

}
