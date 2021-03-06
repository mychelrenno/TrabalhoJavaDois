package br.com.trabalho;

import java.sql.Connection;
import java.util.List;

public interface Dao<T, K> {

	public Connection conexao();
	
	public void excluirTabela(T t);
	
	public void criarTabela(T t);
	
	public void salvar(T t);
	
	public T buscar(K k);
	
	public void atualizar(T t);
	
	public void excluir(K k);
	
	public List<T> listarTodos(T t);
}
