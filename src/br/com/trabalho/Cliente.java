package br.com.trabalho;

import br.com.anotacoes.Column;
import br.com.anotacoes.Table;

@Table("TB_CLIENTE")
public class Cliente {

	@Column(nome="ID")
	private int id;
	
	@Column(nome="NOME")
	private String nome;
	
	@Column(nome="ENDERECO")
	private String endereco;
	
	@Column(nome="TELEFONE")
	private String telefone;
	
	@Column(nome="ESTADOCIVIL")
	private EstadoCivil estadoCivil;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
