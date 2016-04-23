package br.com.trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlGenExtends extends SqlGen{

	@Override
	protected String getCreateTable(Connection con, Object obj) {
		String sql = "CREATE TABLE tb_cliente(cli_id int, cli_nome varchar(255), "
												+ "cli_endereco varchar(255), "
												+ "cli_telefone varchar(255), "
												+ "cli_estadocivil varchar(255))";
		return sql;
	}

	@Override
	protected String getDropTable(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlInsert(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectAll(Connection con, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement getSqlSelectById(Connection con, Object obj) {
		// TODO Auto-generated method stub
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
