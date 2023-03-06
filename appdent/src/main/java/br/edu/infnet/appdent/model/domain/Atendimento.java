package br.edu.infnet.appdent.model.domain;

import br.edu.infnet.appdent.model.auxiliar.Constante;

public class Atendimento {

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	

	private Integer id;
	private String data;
	private boolean pagamento;
	private String obs;
	
	public Atendimento() {
		this.id = null;
		this.data = Constante.DATA_PADRAO;
		this.pagamento = false;
		this.obs = Constante.OBS_PADRAO;
	}
	
	public Atendimento(Integer id, String data, boolean pagamento) {
		this.id = id;
		this.data = data;
		this.pagamento = pagamento;
		this.obs = Constante.OBS_PADRAO;
	}
	
	public Atendimento(Integer id, String data, boolean pagamento, String obs) {
		this(id, data, pagamento);
		this.obs = obs;
	}
	
	public String toString() {
		return "Identificador: " + id + " | Data: " + data + " | Pagamento: " + pagamento + " | Observações: " + obs;
	}
	
	public void imprimir() {
		System.out.println(this);
	}
	
}
