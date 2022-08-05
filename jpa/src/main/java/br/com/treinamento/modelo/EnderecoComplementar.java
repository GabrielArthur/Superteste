package br.com.treinamento.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco_complementar")
public class EnderecoComplementar {
	
	public EnderecoComplementar() {}

	public EnderecoComplementar(Pessoa pessoa, String nome) {
		this.pessoa = pessoa;
		this.nome = nome;
	}

	@Id
	private long id;

	@OneToOne
	private Pessoa pessoa;

	private String nome;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
