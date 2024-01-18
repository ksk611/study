package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ksk98";
		String pwd ="java";
		
		if(conn==null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//오라클 db로 접속
				conn = DriverManager.getConnection(url,user,pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}

}
