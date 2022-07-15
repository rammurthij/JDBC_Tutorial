package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcThree {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String name ="system";
		String password="oracle";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection(url,name,password);
			String query="insert into major values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);           //compile only once
			Scanner sc=new Scanner(System.in);
		while(true) {	
			System.out.println("Enter mobile number of an actor :");
			String mNo=sc.next();
			System.out.println("Enter name of Actor :");
			String nameA=sc.next();
			System.out.println("Enter address of that actor :");
			String address=sc.next();
			ps.setString(1, mNo);
			ps.setString(2, nameA);
			ps.setString(3, address);
			
			ps.executeUpdate();          //can execute number of times
			System.out.println("Record inserted Successfully");
			System.out.println("Do you want to insert more records [yes/no]");
			String option=sc.next();
			if(option.equalsIgnoreCase("no")){
				break;
			}
		}
		con.close();
	}
			
	catch(Exception e){
			
		}

	}

}
