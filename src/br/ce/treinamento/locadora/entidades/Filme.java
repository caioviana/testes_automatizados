package br.ce.treinamento.locadora.entidades;

public class Filme {

	private Long id;
	private String nome;
	private Integer estoque;
	private Double precoLocacao;
	
	public Filme(String nome, Integer estoque, Double precoLocacao) {
		this.nome = nome;
		this.estoque = estoque;
		this.precoLocacao = precoLocacao;
	}
	
	public Filme() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public Double getPrecoLocacao() {
		return precoLocacao;
	}
	public void setPrecoLocacao(Double precoLocacao) {
		this.precoLocacao = precoLocacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
