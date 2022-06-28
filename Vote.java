/*
 * @Author Arnab Kumar Hoodati
 */

//Check eligible for voting or not

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        int age,r;		//Declaring variables

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age:");
        age = sc.nextInt();

        if (age >= 18) { // checking the given condition
            System.out.println("Welcome you can vote");
        } else {
        	r=(18-age);		//required age for a voter 
            System.out.println("You can vote after " + r + " years");
        }

    }

}