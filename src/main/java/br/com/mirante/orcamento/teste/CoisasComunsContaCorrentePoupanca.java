package br.com.mirante.orcamento.teste;

public class CoisasComunsContaCorrentePoupanca {
	protected float saldo;
	protected String numero;
	protected String agencia;
	
	public void depositar(float valor) {
		saldo += valor;
	}

}
