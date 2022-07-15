package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_demo {

	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String name="system";
		String password ="oracle";
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url,name,password);
		String query="create table vikram(name varchar(20),address varchar(20),location varchar(20))";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.executeUpdate();
		System.out.println("Table created Successfully");
		
		con.close();
		
		}catch(Exception e) {
			
		}finally {
			System.out.println("Done Everything");
		}

	}

}
