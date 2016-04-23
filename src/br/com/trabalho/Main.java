package br.com.trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void apagarTabela(){
		String url = "jdbc:postgresql://localhost/ecommercedb?user=postgres&password=xxxx";
		String sql = "DROP TABLE tb_cliente";
		try {
			Connection con = DriverManager.getConnection(url);
			con.prepareStatement(sql).execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void criarTabela(){
		String url = "jdbc:postgresql://localhost/ecommercedb?user=postgres&password=xxxx";
		String sql = "CREATE TABLE tb_cliente(cli_id int, cli_nome varchar(255), cli_endereco varchar(255), cli_telefone varchar(255), cli_estadocivil varchar(255))";
		try {
			Connection con = DriverManager.getConnection(url);
			con.prepareStatement(sql).execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void inserir (Object um){
		
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
		
		Dao<Object, Object> dao = new DaoImplements();
		
		apagarTabela();
		criarTabela();
	}
}
