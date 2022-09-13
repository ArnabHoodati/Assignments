package com;

import java.util.Scanner;

public class AreaCalculator {
	public static void main(String[] args) {	//main method
		Rectangle r = new Rectangle();	//create object of the class
		Scanner sc = new Scanner(System.in);	//create scanner object
		//taking input from user
		System.out.println("Input lenght and breadth of your rectangle : ");	//display the line
		int lenght=sc.nextInt();
		int breadth=sc.nextInt();
		//output
		r.calculateArea(lenght, breadth); 	// invoking the area method
		sc.close();
	}
}