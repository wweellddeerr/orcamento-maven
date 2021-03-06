package br.com.mirante.orcamento.repository;

import br.com.mirante.orcamento.domain.ItemOrcamento;

public class ItemRepositoryJpa implements ItemRepository {

	@Override
	public void excluir(Integer codigoItem) {
		var entityManager = JpaUtils.getEntityManager();
		var itemRecuperado = entityManager.find(ItemOrcamento.class, codigoItem);
		if(itemRecuperado != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(itemRecuperado);
			entityManager.getTransaction().commit();
		}
	}

}
