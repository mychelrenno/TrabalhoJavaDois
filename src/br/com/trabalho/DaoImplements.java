package br.com.trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

class DaoImplements implements Dao<Object, Object> {

	@Override
	public void salvar(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object buscar(Object k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Object k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection abrirConexao() {
		Connection con = null;
		String url = "jdbc:postgresql://localhost/ecommercedb?user=postgres&password=xxxx";
		try {
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void fecharConexao(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
