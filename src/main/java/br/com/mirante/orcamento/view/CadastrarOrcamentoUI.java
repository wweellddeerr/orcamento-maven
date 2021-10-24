package br.com.mirante.orcamento.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.mirante.orcamento.domain.ItemOrcamento;
import br.com.mirante.orcamento.domain.Orcamento;
import br.com.mirante.orcamento.servico.CadastrarOrcamentoServico;

public class CadastrarOrcamentoUI implements Funcionalidade {
	
	private CadastrarOrcamentoServico servico = new CadastrarOrcamentoServico();
	Scanner scanner = new Scanner(System.in);

	public void executar() {
		System.out.println("Digite a descri��o:");
		var descricaoOrcamento = scanner.nextLine();
		
		System.out.println("Digite o m�s:");
		var mes = scanner.nextInt();
		
		System.out.println("Digite o ano:");
		var ano = scanner.nextInt();
		
		System.out.println("Digite o valor total do or�amento:");
		var valorTotal = scanner.nextFloat();
		
		scanner.nextLine();
		
		System.out.println("Informe um item de or�amento:");
		var item = scanner.nextLine();

		List<String> itens = new ArrayList<>();
		itens.add(item);
		
		System.out.println("Deseja incluir um novo item? [S] / [N]");
		String novoItem = scanner.nextLine();
		while(novoItem.equals("S")) {
			System.out.println("Informe um item de or�amento:");
			item = scanner.nextLine();
			itens.add(item);
			System.out.println("Deseja incluir um novo item? [S] / [N]");
			novoItem = scanner.nextLine();
		}
		
		List<ItemOrcamento> itensOrcamento = itens.stream().map(this::converter).toList();
	
		var orcamento = new Orcamento(
			descricaoOrcamento, mes, ano, valorTotal, itensOrcamento
		);
		
		servico.cadastrar(orcamento);
		new MenuPrincipal().executar();
	}
	
	private ItemOrcamento converter(String item) {
		String[] atributos = item.split(";");
		String origem = atributos[0];
		String codigo = atributos[1];
		String descricao = atributos[2];
		float valorUnitario = Float.parseFloat(atributos[3]);
		String unidade = atributos[4];
		float quantidade = Float.parseFloat(atributos[5]);
		float valorTotalInformado = Float.parseFloat(atributos[6]);
		//
		return new ItemOrcamento(
			origem, codigo, descricao, valorUnitario, unidade, quantidade, valorTotalInformado
		);
	}
}
