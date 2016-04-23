package br.com.trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void apagarTabela(Object obj, DaoImplements daoImpl){
		daoImpl.excluirTabela(obj);
	}

	public static void criarTabela(Object obj, DaoImplements daoImpl){
		daoImpl.criarTabela(obj);
	}

	public static void inserir (Cliente clie, DaoImplements daoImpl){
		daoImpl.salvar(clie);
	}

	public void inserirDois (Object dois){
		
	}

	public void inserirTres (Object tres){
		
	}

	public void listarTodos (){
		
	}

	public void buscar (Object um){
		
	}

	public void alterar (Object um){
		
	}

	public void excluir (Object dois){
		
	}

	public void listarTodosDois(){
		
	}
	
	public static void main (String []args){
		Cliente clienteUm = new Cliente();
		
		clienteUm.setId(1);
		clienteUm.setNome("Mychel");
		clienteUm.setTelefone("99073646");
		clienteUm.setEstadoCivil(clienteUm.getEstadoCivil().SOLTEIRO);
		clienteUm.setEndereco("Rua das guardênias Nº878");
		
		Cliente clienteDois = new Cliente();
		
		clienteDois.setId(2);
		clienteDois.setNome("Rennó");
		clienteDois.setTelefone("22222222");
		clienteDois.setEstadoCivil(clienteDois.getEstadoCivil().CASADO);
		clienteDois.setEndereco("Rua das Dois Nº878");
		
		Cliente clienteTres = new Cliente();
		
		clienteTres.setId(3);
		clienteTres.setNome("Eugênio");
		clienteTres.setTelefone("33333333");
		clienteTres.setEstadoCivil(clienteTres.getEstadoCivil().VIUVO);
		clienteTres.setEndereco("Rua das Tres Nº878");
		
		DaoImplements daoImpl = new DaoImplements();
		
//		apagarTabela(clienteUm, daoImpl);
		
		criarTabela(clienteUm, daoImpl);
		
		inserir(clienteUm, daoImpl);
		
		inserir(clienteDois, daoImpl);
		
		inserir(clienteTres, daoImpl);
	}
}
