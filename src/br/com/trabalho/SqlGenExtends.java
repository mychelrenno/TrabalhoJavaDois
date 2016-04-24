package br.com.trabalho;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.anotacoes.Coluna;
import br.com.anotacoes.Tabela;

public class SqlGenExtends extends SqlGen{

	@Override
	protected String getDropTable(Connection con, Object obj) {
		String sql = "DROP TABLE ";
		Tabela anotacaoTabela = obj.getClass().getAnnotation(Tabela.class);
		sql += anotacaoTabela.value().toString();
		try {
			con.prepareStatement(sql).execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	protected String getCreateTable(Connection con, Object obj) {
		String sql = "CREATE TABLE ";
		Tabela anotacaoTabela = obj.getClass().getAnnotation(Tabela.class);
		sql += anotacaoTabela.value().toString()+"(";
		
		Field[] atributos = obj.getClass().getDeclaredFields();
		for (int i = 0; i < atributos.length; i++) {
			Field field = atributos[i];

			String nomeColuna = "";
			String tipoColuna = "";
			
			Coluna anotacaoColuna = field.getAnnotation(Coluna.class);
			nomeColuna = anotacaoColuna.nome();
			
			Class<?> tipoParametro = field.getType();
			if (tipoParametro.equals(String.class) || tipoParametro.equals(EstadoCivil.class)) {
				tipoColuna = "VARCHAR(255)";

			} else if (tipoParametro.equals(int.class)) {
				tipoColuna = "INT";
			}
			
			if (i < atributos.length - 1){
				sql += nomeColuna+" "+tipoColuna+", ";
			} else {
				sql += nomeColuna+" "+tipoColuna+")";
			}
			
			System.out.println(nomeColuna);
			System.out.println(tipoColuna);
		}
		
		System.out.println(sql);
		
		try {
			con.prepareStatement(sql).execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected PreparedStatement getSqlInsert(Connection con, Object obj) {
		String sql = "INSERT INTO ";
		Tabela anotacaoTabela = obj.getClass().getAnnotation(Tabela.class);
		sql += anotacaoTabela.value().toString()+"(";
		
		Field[] atributos = obj.getClass().getDeclaredFields();
		for (int i = 0; i < atributos.length; i++) {
			Field field = atributos[i];

			String nomeColuna = "";
			
			Coluna anotacaoColuna = field.getAnnotation(Coluna.class);
			nomeColuna = anotacaoColuna.nome();
			
			if (i < atributos.length - 1){
				sql += nomeColuna+", ";
			} else {
				sql += nomeColuna+")VALUES (";
			}
			
			System.out.println(nomeColuna);
		}
		
		Cliente clie = (Cliente) obj;
		sql += clie.getId()+", "
				+"'"+clie.getNome()+"', "
				+"'"+clie.getEndereco()+"', "
				+"'"+clie.getTelefone()+"', "
				+"'"+clie.getEstadoCivil()+"')";
		
//		INSERT INTO table_name (column1,column2,column3,...)
//		VALUES (value1,value2,value3,...);
		
		System.out.println(sql);
		
		try {
			con.prepareStatement(sql).execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectAll(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectById(Connection con, Object obj) {
		String sql = "SELECT * FROM ";
		Tabela anotacaoTabela = obj.getClass().getAnnotation(Tabela.class);
		sql += anotacaoTabela.value().toString()+" ";
		
		Cliente clie = (Cliente) obj;
		sql += "WHERE ID = "+clie.getId();
		
//		SELECT column_name,column_name
//		FROM table_name;
		
		System.out.println(sql);
		
		try {
			Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()){
	            int id = rs.getInt("id");
	            String nome = rs.getString("nome");
	            
	            
	            Cliente newCliente = new Cliente();
	            
	            newCliente.setId(id);
	            newCliente.setNome(nome);
	            
	            System.out.println("Minha entidade: " + newCliente);
	         }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	protected PreparedStatement getSqlUpdateById(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlDeleteById(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
