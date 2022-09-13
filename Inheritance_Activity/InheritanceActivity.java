package Inheritance;

public class InheritanceActivity {	
	public static void main(String[] args) {
		System.out.println("Manager:-");
		Manager m=new Manager(126354,"Peter","Chennai India",237844,65000);
		m.calculateSalary();	//calling the calculate salary methods of manager
		m.calculateTransportAllowance();	//calling the transport allowance methods of manager
		
		System.out.println("Trainee:-");
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t.calculateSalary();	//calling the calculate salary methods of trainee
		t.calculateTransportAllowance();	//calling the transport allowance methods of trainee

	}

}
