package br.com.mirante.orcamento.view;

import br.com.mirante.orcamento.domain.ItemOrcamento;
import br.com.mirante.orcamento.domain.Orcamento;

public class UIUtils {
	
	private UIUtils() {}
	
	static void exibirOrcamento(Orcamento orcamento) {
		System.out.print(orcamento.getId());
		System.out.print("           |");
		System.out.print(orcamento.getDescricao());
		System.out.print("           |");
		System.out.print(orcamento.getMes() + "/" + orcamento.getAno());
		System.out.print("           |");
		System.out.print(orcamento.getValorTotalInformado());
		System.out.println();
	}

	static void exibirItemOrcamento(ItemOrcamento item) {
		System.out.print(item.getId());
		System.out.print("           |");
		System.out.print(item.getOrigem());
		System.out.print("           |");
		System.out.print(item.getCodigo());
		System.out.print("           |");
		System.out.print(item.getDescricao());
		System.out.print("           |");
		System.out.print(item.getQuantidade());
		System.out.print("           |");
		System.out.print(item.getUnidade());
		System.out.print("           |");
		System.out.print(item.getValorUnitario());
		System.out.print("           |");
		System.out.print(item.getValorTotalInformado());
		System.out.print("           |");
		System.out.print(item.possuiInconsistencia() ? "Sim" : "Não");
		System.out.println();
	}

}
