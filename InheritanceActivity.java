public class InheritanceActivity {	
	public static void main(String[] args) {
		System.out.println("Manager:-");
		Manager m=new Manager(126354,"Peter","Chennai India",237844,65000);
		m.calculateSalary();
		m.calculateTransportAllowance();
		
		
		
		System.out.println("Trainee:-");
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t.calculateSalary();
		t.calculateTransportAllowance();

	}

}