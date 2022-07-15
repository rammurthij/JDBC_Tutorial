package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_demo {

	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String name="system";
		String password ="oracle";
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url,name,password);
		//String query="create table vikram(name varchar(20),address varchar(20),location varchar(20))";
		String query="select* from vikram";
		PreparedStatement ps=con.prepareStatement(query);
		
		//ps.executeUpdate("insert into vikram values('Kamal Hassan','chennai','Tamilnadu')");
		//ps.executeUpdate("insert into vikram values('Vijay Sethupathi','chennai','Tamilnadu')");
		//System.out.println("Values are inserted");
		//System.out.println("Table created Successfully");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3));
		}
		
		con.close();
		
		}catch(Exception e) {
			
		}finally {
			System.out.println("Done Everything");
		}

	}

}
