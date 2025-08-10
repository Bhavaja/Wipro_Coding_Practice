package jdbc_pkg;

import java.sql.*;

public class PreparedStatementClass {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/sql_jdbc_database";
		String username = "root";
		String password = "Bhavaja@02";
		
		String create = "create table Users(name varchar(20),id int)";
		String insert = "insert into Users(name,id)values(?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con.prepareStatement(insert);
			
			
			
		}

	}

}
