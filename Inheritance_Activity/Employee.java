package Inheritance;

public class Employee {	//class
	//create instances variable
	 long employeeId;
	 String employeeName;
	 String employeeAddress;
	 long employeePhone;
	 double basicSalary;
	 double specialAllowance = 250.80;
	 double hra = 1000.50;
	 
	 //Create an overloaded constructor 
	 Employee(long id, String name, String address, long phone , double basicSalary){
		 this.employeeId=id;
		 this.employeeName=name;
		 this.employeeAddress=address;
		 this.employeePhone=phone;
		 
	 }
	//create a method for calculate salary
	void calculateSalary () {	
		double salary = basicSalary + (basicSalary * specialAllowance/100) + basicSalary * hra/100;
		System.out.println(salary);
	}
	//create a method for calculate Transport Allowance 
	void calculateTransportAllowance () {
		//calculate the transport allowance by calculating 10% (default allowance) of the salary
		double transportAllowance = 10*basicSalary/100;	
		System.out.println(transportAllowance);
	}
}
//deriving manager class from employee class
class Manager extends Employee {
	//Create an instance of Manager class by calling the overloaded constructor 
	Manager(long id, String name, String address, long phone,double salary){
		super(id,name,address,phone,salary);
		this.basicSalary=salary;
	}
	@Override
	void calculateTransportAllowance () {
		//For a manager, the transportation allowance is 15% of the basic salary
		double transportAllowance = 15*basicSalary/100;	
		System.out.println(transportAllowance);
	}
}
//deriving trainee class from employee class
class Trainee extends Employee {
	//Create an instance of Trainee class by calling the overloaded constructor 
	Trainee(long id, String name, String address, long phone,double salary){
		super(id,name,address,phone,salary);
		this.basicSalary=salary;
	}
}
