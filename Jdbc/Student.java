package Jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//loading driver
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arnabdb" ,"root" ,"root");	//getting connection 
			Statement stm = conn.createStatement();	//creating statement
			
			
			stm.executeUpdate("create table student(id int, name, address, phone)");	//executing inserting query
			stm.executeUpdate("insert into student values(1, 'Arnab','Kolkata',9874896)");	//executing inserting query
			stm.executeUpdate("insert into student values(2, 'Rohit','Kolkata',7894589)");	//executing inserting query
			
			System.out.println("inserted succesfully...");
			
			ResultSet rs = stm.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			conn.close();	// closing connection
		} catch (Exception e) {	//exception handling
			System.out.println(e);
		}
	}
}