package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
	public static void main(String[] args) {


		try {
			DriverManager.registerDriver(new  com.mysql.cj.jdbc.Driver());
			
		Connection conn =
	DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "rps@123");
	
			Statement stmt = conn.createStatement();
			String query="select * from Dept";
			ResultSet rs=stmt.executeQuery(query);
			  while(rs.next()) {
				  int dno=rs.getInt("dno");
				  String location =rs.getString("location");
				  String dname=rs.getString("dname");
				  System.out.println(dno+" "+dname+" "+location);
			  }  
			  }catch(Exception e) {
				  e.printStackTrace();
			  }
}
}
