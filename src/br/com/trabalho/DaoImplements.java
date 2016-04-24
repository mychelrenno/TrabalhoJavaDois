package br.com.trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

class DaoImplements implements Dao<Object, Object> {

	@Override
	public Connection conexao() {
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
	public void excluirTabela(Object obj) {
		Connection con = conexao();
		SqlGenExtends sqlGenEx = new SqlGenExtends();
		sqlGenEx.getDropTable(con, obj);
		
	}
	
	public void criarTabela(Object obj) {
		Connection con = conexao();
		SqlGenExtends sqlGenEx = new SqlGenExtends();
		sqlGenEx.getCreateTable(con, obj);
		
	}
	
	@Override
	public void salvar(Object obj) {
		Connection con = conexao();
		SqlGenExtends sqlGenEx = new SqlGenExtends();
		sqlGenEx.getSqlInsert(con, obj);
		
	}

	@Override
	public Object buscar(Object k) {
		Connection con = conexao();
		SqlGenExtends sqlGenEx = new SqlGenExtends();
		sqlGenEx.getSqlSelectById(con, k);
		return null;
	}

	@Override
	public void atualizar(Object t) {
		Connection con = conexao();
		SqlGenExtends sqlGenEx = new SqlGenExtends();
		sqlGenEx.getSqlUpdateById(con, t);
	}

	@Override
	public void excluir(Object k) {
		Connection con = conexao();
		SqlGenExtends sqlGenEx = new SqlGenExtends();
		sqlGenEx.getSqlDeleteById(con, k);
	}

	@Override
	public List<Object> listarTodos(Object t) {
		Connection con = conexao();
		SqlGenExtends sqlGenEx = new SqlGenExtends();
		sqlGenEx.getSqlSelectAll(con, t);
		return null;
	}
}
