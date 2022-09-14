package Thread;
/*
 * @author Arnab Kumar Hoodati
 */

import java.util.ArrayList;

public class ThreadNumber implements Runnable {  // main class
	public void run() {
		ArrayList<Integer> numbers = new ArrayList<Integer>(10000000);
		//for loop
		for (int i = 0; i <= 10000000; i++)
		{
			//add values
		   numbers.add(i);
		   System.out.println(numbers.get(i));
		}	
		//calculating time
		System.out.println("Time taken in ms : "+System.currentTimeMillis ());
		}
		public static void main(String... args) {	//main method
			Runnable r= new ThreadNumber();	//creating object of runnable String Name
			Thread t=new Thread(r);		//object of thread class using 
			t.start();		//thread class is user to start a newly
			
		}
	
	}