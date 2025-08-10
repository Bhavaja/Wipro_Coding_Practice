package jdbc_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/sql_jdbc_database";
		String username = "root";
		String password = "Bhavaja@02";
		
		String create = "create table student(Name varchar(20),Id int,Class int,Section varchar(20),Subject varchar(20),Marks int,Grade varchar(20),PassOrFail varchar(20),ParentName varchar(20),Contact varchar(20))";
		
		String insert =
				"insert into student(Name,Id,Class,Section,Subject,Marks,Grade,PassOrFail,ParentName,Contact) values"
				+ "('Kevin',1,8,'A','Science',80,'A2','Pass','Andrew','9876543210'),"
				+ "('Malvin',2,8,'A','Science',81,'A2','Pass','Mathew','7654321098'),"
				+ "('Simba',3,8,'A','Science',85,'A2','Pass','Mufasa','8765432190'),"
				+ "('Nala',4,8,'A','Science',92,'A1','Pass','Tommy','6789012345'),"
				+ "('Elsa',5,8,'A','Science',95,'A1','Pass','Monica','9087654312'),"
				+ "('Lucy',6,8,'B','Maths',81,'A2','Pass','Rocky','8907654321'),"
				+ "('Daisy',7,8,'B','Maths',83,'A2','Pass','Diggy','9078563412'),"
				+ "('Nysa',8,8,'B','Maths',97,'A1','Pass','Kajol','8899007766'),"
				+ "('Rudra',9,8,'B','Maths',91,'A1','Pass','Aswin','9977880066'),"
				+ "('Veer',10,8,'B','Maths',90,'A1','Pass','Chris','9087654321')";
		
		String delete = "delete from student where Id in(2,4)";
		
		String update = "update student set Subject='Maths',Marks=96,Contact='9876543210' where Id = 5";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(url,username,password);
			Statement st = c.createStatement();
			
			st.executeUpdate(create);
			System.out.println("student table created");
				
			st.executeUpdate(insert);
			System.out.println("Inserted 10 records into student table.");
			
			st.executeUpdate(delete);		  
			System.out.println("Deleted 2nd and 4th records from student table.");
			
			st.executeUpdate(update);
			System.out.println("Updated the 5th record in student table.");
			
			String select = "select * from student";
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				System.out.println(rs.getString("Name")+" , "+rs.getInt("Id")+" , "+rs.getInt("Class")+" , "+rs.getString("Section")+" , "+rs.getString("Subject")+" , "+rs.getInt("Marks")+" , "+rs.getString("Grade")+" , "+rs.getString("PassOrFail"));
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("JDBC driver not found"+e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("SQL error"+e.getMessage());
		}
		
		
		

	}

}
