package br.com.mirante.orcamento.teste;

public class ContaCorrente extends Conta {
	
	private float limite;

	@Override
	protected boolean temSaldoSuficiente(float valor) {
		return saldo + limite >= valor;
	}
	
	

}
