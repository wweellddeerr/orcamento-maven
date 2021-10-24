package br.com.mirante.orcamento.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Orcamento implements Serializable {

	private static final long serialVersionUID = 137306958688896276L;
	@Id
	private Integer id;
	private String descricao;
	private Integer mes, ano;
	
	@Column(name = "VALOR_TOTAL_INFORMADO")
	private Float valorTotalInformado;

	@OneToMany(mappedBy = "orcamento")
	private List<ItemOrcamento> itensOrcamento;
	
	protected Orcamento() {}
	
	public Orcamento(
			String descricao,
			int mes,
			int ano,
			float valorTotalInformado,
			List<ItemOrcamento> itensOrcamento
	) {
		super();
		this.descricao = descricao;
		this.mes = mes;
		this.ano = ano;
		this.valorTotalInformado = valorTotalInformado;
		this.itensOrcamento = itensOrcamento;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<ItemOrcamento> detalharInconsistencias() {
		var itensComInconsistencia = new ArrayList<ItemOrcamento>();
		for (var itemOrcamento : itensOrcamento) {
			if(itemOrcamento.possuiInconsistencia()) {
				itensComInconsistencia.add(itemOrcamento);
			}
		}
		return itensComInconsistencia;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getMes() {
		return mes;
	}

	public Integer getAno() {
		return ano;
	}

	public Float getValorTotalInformado() {
		return valorTotalInformado;
	}

	public List<ItemOrcamento> getItensOrcamento() {
		return itensOrcamento;
	}

}
