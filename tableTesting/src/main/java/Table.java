package main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {
	
	public Connection con = null;

	public Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/sql_jdbc_database";
			String username = "root";
			String password = "Bhavaja@02";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public String createTable() throws SQLException  {
		
		String create = "create table employees(id int, name varchar(20))";
		con=getConnection();
		Statement st = con.createStatement();
		st.executeUpdate(create);
		return "Table is created.";
	}
	
	public String insertData() throws SQLException  {

		String insert = "insert into employees(id,name) values(1,'Kevin'),(2,'John')";
		con=getConnection();
		Statement st = con.createStatement();
		st.executeUpdate(insert);
		return("2 rows inserted");
	}
	
	public String deleteData() throws SQLException  {
		
		String delete = "delete from employees where id = 2";
		con=getConnection();
		Statement st = con.createStatement();
		st.executeUpdate(delete);
		return("1 row deleted");
	}
	
	public String updateData() throws SQLException  {
		
		String update = "update employees set name = 'Charlie' where id = 2";
		con=getConnection();
		Statement st = con.createStatement();
		st.executeUpdate(update);
		return("1 row updated");
	}
	
	
	
	
	
}
