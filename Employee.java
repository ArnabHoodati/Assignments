public class Employee {
	 long employeeId;
	 String employeeName;
	 String employeeAddress;
	 long employeePhone;
	 double basicSalary;
	 double specialAllowance = 250.80;
	 double hra = 1000.50;
	 
	 
	 Employee(long id, String name, String address, long phone , double basicSalary){
		 this.employeeId=id;
		 this.employeeName=name;
		 this.employeeAddress=address;
		 this.employeePhone=phone;
		 
	 }
	
	
	void calculateSalary () {	
		double salary = basicSalary + (basicSalary * specialAllowance/100) + basicSalary * hra/100;
		System.out.println(salary);
	}
	
	void calculateTransportAllowance () {
		double transportAllowance = 10*basicSalary/100;	
		System.out.println(transportAllowance);
	}
	

}
class Manager extends Employee {

	Manager(long id, String name, String address, long phone,double salary){
		super(id,name,address,phone,salary);
		this.basicSalary=salary;
	}
	
	void calculateTransportAllowance () {
		double transportAllowance = 15*basicSalary/100;	
		System.out.println(transportAllowance);
	}

}
class Trainee extends Employee {

	Trainee(long id, String name, String address, long phone,double salary){
		super(id,name,address,phone,salary);
		this.basicSalary=salary;
	}
}