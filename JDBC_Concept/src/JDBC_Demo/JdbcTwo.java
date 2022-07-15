package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
                         //RETRIVEING THE VALUES FROM THE DATABASE (ResultSet rs=st.executeQuery( );

public class JdbcTwo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String name="system";
		String password="oracle";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con =DriverManager.getConnection(url,name,password);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select movie from vikram");
		
		while(rs.next()) {
//			System.out.println(rs.getString(1)+rs.getString(2));
			System.out.println(rs.getString(2));
			//System.out.println(rs.getInt("s_id")+" "+rs.getString("s_name")+" "+rs.getString("s_location")+" "+rs.getInt("s_MobileNo"));
		
//		System.out.println(rs.getInt("E_id")+" "+rs.getString("E_Name")+" "+rs.getInt("E_SALARY")+" "+rs.getString("E_LOCATION")+" "+rs.getString("E_DEPT"));
			con.close();
		}
		
	}

}
