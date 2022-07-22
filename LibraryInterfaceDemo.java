package com;
/*
@author: Arnab Kumar Hoodati
*/
public class LibraryInterfaceDemo {		//class
	public static void main(String[] args) {	//Main Method
		// Test case #1:
		KidUsers k = new KidUsers(); //Create object of KidUsers
		k.setAge(10);	//set the age
		k.setBookType("Kids");	//set the Book Type
		k.registerAccount();	//invoke the registerAccount method  of the  KidUsers object
		k.requestBook();	//invoke the requestBook method  of the  KidUsers object
		
		k.setAge(18);	//set the age
		k.setBookType("Fiction");	//set the Book Type
		k.registerAccount();	//invoke the registerAccount method  of the  KidUsers object
		k.requestBook();	//invoke the requestBook method  of the  KidUsers object
		
		System.out.println();	//Print message
		
		// Test case #2:
		AdultUser a =new AdultUser();	//Create object of AdultUser
		a.setAge(5);	//set the age
		a.setBookType("Kids"); //set the Book Type
		a.registerAccount();	//invoke the registerAccount method  of the  Adult User object
		a.requestBook();	//invoke the requestBook method  of the  Adult User object
		
		a.setAge(23);	//set the age
		a.setBookType("Fiction");	//set the Book Type
		a.registerAccount();	//invoke the registerAccount method  of the  Adult User object
		a.requestBook();	//invoke the requestBook method  of the  Adult User object
		
		System.out.println();	//Print message
		
	}

}
