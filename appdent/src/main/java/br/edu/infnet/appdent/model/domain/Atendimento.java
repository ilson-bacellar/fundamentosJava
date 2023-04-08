package br.edu.infnet.appdent.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.appdent.model.auxiliar.Constante;

@Entity
@Table(name = "TAtendimento")
public class Atendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime data;
	private boolean pagamento;
	private String obs;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idPaciente")
	private Paciente paciente;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Servico> servicos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Atendimento() {
		this.id = null;
		this.data = Constante.DATA_PADRAO;
		this.pagamento = false;
		this.obs = Constante.OBS_PADRAO;
	}
	
	public Atendimento(Integer id, LocalDateTime data, boolean pagamento) {
		this.id = id;
		this.data = data;
		this.pagamento = pagamento;
		this.obs = Constante.OBS_PADRAO;
	}
	
	public Atendimento(Integer id, LocalDateTime data, boolean pagamento, String obs) {
		this(id, data, pagamento);
		this.obs = obs;
	}
	
	public String toString() {
		return "Identificador: " + id + " | Data: " + data + " | Pagamento: " + pagamento + " | Observações: " + obs;
	}
	
	public void imprimir() {
		System.out.println(this);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
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
		public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
