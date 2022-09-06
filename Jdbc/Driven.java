package Jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Driven {     // main method
	
	public static void main(String[] args){    // main method
		
		try {
		// create an object of CrudDemo class
			Driven d = new Driven();
	
		// to select what operation to be done from user
		while(true) {
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Display");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			
			System.out.print("Enter your choice : ");
			// read the user input
			int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose one option"));
			
			
			// switch case
			switch(choice) {
			
			// 1 Insert
			case 1: 
				d.insertData();
				break;
				
			// 2 Update
			case 2:
				d.updateData();
				break;
				
			// 3 Display
			case 3:
				d.displayData();
				break;
				
			// 4 Delete	
			case 4:
				d.deleteData();
				break;
				

				
			// 5. Exit	
			case 5:
				System.out.println("Ok good luck");
				break;
				
			default:
				System.out.println("wrong input");
				break;
			}
			if(choice==5) {
				break;
			}
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	// Declare a method for connection
	public Connection getConnect() {
		// try block
		try {
			// loading driver and getting connection
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arnabdb" ,"root" ,"root");
			
			return conn;
		// exception handling
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	// method to insert the data
	public void insertData() {
		// taking user inputs
		int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id :"));
		String name = JOptionPane.showInputDialog("Enter name :");
		String address = JOptionPane.showInputDialog("Enter address :");
		int phone = Integer.parseInt(JOptionPane.showInputDialog("Enter phone id :"));
		try {
			// call getConnection() method
			Connection conn = getConnect();
			// declare the sql statement
			PreparedStatement pstm = conn.prepareStatement("insert into student values(?,?,?,?)");
			// setting all inputs into db
			pstm.setInt(1, id);
			pstm.setString(2, name);
			pstm.setString(3, address);
			pstm.setInt(4, phone);
			// execute the statement
			pstm.execute();
			System.out.println("inserted succesfully...");
			// close the objects
			pstm.close();
			conn.close();
		// exception handling	
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// method to display the data
	public void displayData() {
		// try block
		try {
			
			// called getConnection() method
			Connection conn = getConnect();
			// declare the sql statement
			Statement stm = conn.createStatement();
			// show the result of statement
			ResultSet rs = stm.executeQuery("select * from student");
			// traversing through table
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			// close 
			rs.close();
			stm.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	// declare a method for delete the data
	public void deleteData(){
		// try block
		try {
			// called the connection method
			Connection conn = getConnect();
			// declare the sql statement
			Statement stm = conn.createStatement();
			System.out.println("Enter id to delete: ");
			int x = stm.executeUpdate("delete from student where id = "+Integer.parseInt(JOptionPane.showInputDialog("Enter student's id which you want to delete"))+"");
			
			// execute the statement
			// condition to check operation done or not
			if(x>=1) { 
				System.out.println("Deleted succesfully!");
			}
			else {
				System.out.println("Data not match!");
			}
			// close objects
			stm.close();
			conn.close();
		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	// method to update the data
	public void updateData() {
		// try block
		try {
			// called getConnection() method
			Connection conn = getConnect();
			PreparedStatement pstm = conn.prepareStatement("update student set where id = ?, name = ?, address = ?, phone = ? ");
			// taking user inputs
			int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id"));
			String name = JOptionPane.showInputDialog("Enter Name :");
			String address = JOptionPane.showInputDialog("Enter address : ");
			int phone = Integer.parseInt(JOptionPane.showInputDialog("Enter phone no. :"));
			// setting all inputs into db

			pstm.setInt(1, id);
			pstm.setString(2, name);
			pstm.setString(3, address);
			pstm.setInt(4, phone);

			// execute the statement
			int x = pstm.executeUpdate();
			// close objects
			pstm.close();
			conn.close();
			// condition to check the operation done or not
			if(x>=1) {
				System.out.println("Updated !");
			}
			else {
				System.out.println("Data not match!");
			}

		// catch block	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}