package br.com.mirante.orcamento.teste;

abstract class Conta {

	protected float saldo;
	protected String numero;
	protected String agencia;
	
	protected abstract boolean temSaldoSuficiente(float valor);
	
	public boolean sacar(float valor) {
		if(temSaldoSuficiente(valor)) {
			saldo -= saldo;
			return true;
		} else {
			System.out.println("N�o h� saldo dispon�vel");
			return false;
		}
	}
	
	public void depositar(float valor) {
		saldo += valor;
	}
	
}
