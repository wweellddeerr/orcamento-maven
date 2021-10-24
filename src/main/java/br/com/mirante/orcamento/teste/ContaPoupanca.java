package br.com.mirante.orcamento.teste;

public class ContaPoupanca extends Conta {

	@Override
	protected boolean temSaldoSuficiente(float valor) {
		return saldo >= valor;
	}
	

}
