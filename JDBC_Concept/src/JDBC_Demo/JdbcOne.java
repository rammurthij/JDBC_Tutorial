package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;                                          

//---Steps to connect DataBase                                   //CRUD OPERATIONS
//import Driver ---> ojdbc Driver
//Register Driver----->Class.forName( );
//Create Connection -->Connection con= DriverManager.getConnection( );
//Create Statement --->Statement st=con.createStatement();
//Execute Queries----->st.execute
//Close Connection---->con.close();

public class JdbcOne {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Welcome to Student Management App");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		Statement st=con.createStatement();
		
//	st.executeUpdate("create table student(s_id number(3),s_name varchar(20),s_location varchar(20),s_MobileNo number(10))");
//        
//		st.executeUpdate("insert into student values(101,'Ram Murthi','Markapur',7981534021)");
//		st.executeUpdate("insert into student values(102,'Akhila','Hyderabad',79815340)");
//		st.executeUpdate("insert into student values(103,'Madhavi','vijayawada',9848031)");
//		st.executeUpdate("insert into student values(104,'Rasool','Markapur',9848031112)");
		
		//---Update value
		//st.executeUpdate("update student set s_location='Hyderabad' where s_id=103");
		
		//--Delete value
		
		st.executeUpdate("delete from student where s_id=104");
//		System.out.println("values inserted");
		
		System.out.println("Table created");
		con.close();
		System.out.println("Connected closed");
	}

}
