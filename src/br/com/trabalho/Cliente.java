package br.com.trabalho;

import br.com.anotacoes.Coluna;
import br.com.anotacoes.Tabela;

@Tabela("TB_CLIENTE")
public class Cliente {

	@Coluna(nome="ID")
	private int id;
	
	@Coluna(nome="NOME")
	private String nome;
	
	@Coluna(nome="ENDERECO")
	private String endereco;
	
	@Coluna(nome="TELEFONE")
	private String telefone;
	
	@Coluna(nome="ESTADOCIVIL")
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
	@Override
    public String toString() {
        return "Entidade{" + "id=" + id + ", nome=" + nome + '}';
    }
}
