package edu.sdnu.sise.grades.scorm.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import com.mysql.jdbc.Connection;

import edu.sdnu.sise.grades.scorm.domain.Account;

public class JDBCUtil {

	public JDBCUtil() {
	}

	public static Connection getConnection(String url, String driver,
			String userName, String password) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn;

		Class.forName(driver).newInstance();
		conn = (Connection) DriverManager
				.getConnection(url, userName, password);
		return conn;
	}

	public static  List<Account> selectData(Connection conn, String sql)
			throws SQLException {
		ResultSetHandler<List<Account>> accountResultSetHandler = new ResultSetHandler<List<Account>>() {

			@Override
			public List<Account> handle(ResultSet resultSet)
					throws SQLException {
				if (!resultSet.next()) {
					return null;
				}

				ResultSetMetaData meta = resultSet.getMetaData();
				int cols = meta.getColumnCount();
				List<Account> result = new ArrayList<Account>(cols);

				while (resultSet.next()) {
					String id = resultSet.getString("id");
					String accName = resultSet.getString("name");
					String accPwd = resultSet.getString("password");
					Account account = new Account();
					account.setId(id);
					account.setName(accName);
					account.setPassword(accPwd);
					result.add(account);
				}

				return result;
			}
		};
		QueryRunner run = new QueryRunner();
		List<Account> accounts = run.query(conn, sql, accountResultSetHandler);
		
		return accounts;
	}
}
