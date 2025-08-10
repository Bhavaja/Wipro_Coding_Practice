package jdbc_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMysql {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/sql_jdbc_database";
		String username = "root";
		String password = "Bhavaja@02";
		String query = "insert into Employee(EmpId,EmpName,EmpSalary) values(203,'Simba',40000)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url,username,password);
			Statement st = c.createStatement();

			int count = st.executeUpdate(query);
			System.out.println("Number of rows affected by this query: "+count);
			
			st.close();
			c.close();
			System.out.println("Connection closed");
		}
		catch(ClassNotFoundException e){
			System.out.println("JDBC driver not found"+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("SQL error"+e.getMessage());
		}

	}

}
