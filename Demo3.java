package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "postgres";
		Connection con = DriverManager.getConnection(url, username, password);
		String sql="select * from practice";
		
		Statement stm = con.createStatement();
		
		ResultSet rs = stm.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		System.out.println(rsmd.getColumnName(3));
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.isNullable(1));
		System.out.println(rsmd.getColumnClassName(1));

	}

}
