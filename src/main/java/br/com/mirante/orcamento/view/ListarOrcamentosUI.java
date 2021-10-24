package br.com.mirante.orcamento.view;

import br.com.mirante.orcamento.domain.Orcamento;
import br.com.mirante.orcamento.servico.ListarOrcamentosServico;

public class ListarOrcamentosUI implements Funcionalidade {
	
	private ListarOrcamentosServico servico = new ListarOrcamentosServico(); 

	public void executar() {
		var orcamentos = servico.listarOrcamentos();
		for (Orcamento orcamento : orcamentos) {
			UIUtils.exibirOrcamento(orcamento);
		}
		new MenuPrincipal().executar();
	}

}
