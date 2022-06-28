/*
 * @Author Arnab Kumar Hoodati
 */

//Check wheather eligible for donating blood or not

import java.util.Scanner;

public class DonateBlood {
	public static void main(String[] args) {

        int age,weight;		//Declaring variables

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age:");
        age = sc.nextInt();
        			 		//Get input from user
        System.out.print("Enter the Weight:");
        weight = sc.nextInt();
        
        if(age>25 && weight>48) {		//condition given
        	System.out.println("Welcome You can donate your blood");
        }else {
        	System.out.println("You can't donate  blood");
        }

}
}