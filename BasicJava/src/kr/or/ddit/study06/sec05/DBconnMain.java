package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnMain {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public static void main(String[] args) {
		DBconnMain db = new DBconnMain();
		db.selectAll();
	}
	
	public void selectAll() {
		try {
			conn = DBConn.getConnection();
			//쿼리를 DB에 전송
			stmt = conn.createStatement();
			
			//원하는 SQL 데이터 구문을 적어준다
			String sql =  "  SELECT MEM_ID, MEM_NAME, MEM_BIR \r\n" + 
						  "  FROM MEMBER\r\n" + 
						  "  WHERE MEM_ID='a001' ";
			//결과를 받아오는 객체
			rs = stmt.executeQuery(sql);
			//rs.next -> 결과 값이 있으면 계속 출력.오라클 데이터 1줄
			while(rs.next()) {
				String id = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
				String bir = rs.getString("MEM_BIR");
				
				System.out.println(id+"\t"+name+"\t"+bir);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
