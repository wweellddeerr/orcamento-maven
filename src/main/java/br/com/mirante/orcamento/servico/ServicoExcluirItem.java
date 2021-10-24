package br.com.mirante.orcamento.servico;

import br.com.mirante.orcamento.repository.ItemRepository;
import br.com.mirante.orcamento.repository.ItemRepositoryJpa;

public class ServicoExcluirItem {
	
	private ItemRepository repositorio = new ItemRepositoryJpa();

	public void excluirItem(Integer codigoItem) {
		repositorio.excluir(codigoItem);
	}

}
