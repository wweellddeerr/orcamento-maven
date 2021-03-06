package br.com.mirante.orcamento.servico;

import br.com.mirante.orcamento.domain.Orcamento;
import br.com.mirante.orcamento.repository.OrcamentoRepository;
import br.com.mirante.orcamento.repository.OrcamentoRepositoryJpa;

public class CadastrarOrcamentoServico {
	
	private OrcamentoRepository repositorio = new OrcamentoRepositoryJpa();

	public void cadastrar(Orcamento orcamento) {
		int maiorId = repositorio.obterMaiorId();
		orcamento.setId(maiorId + 1);
		repositorio.salvar(orcamento);
	}
}
