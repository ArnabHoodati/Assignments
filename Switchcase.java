
/**
 * Write a description of class Switchcase here.
 *
 * @author Arnab Kumar Hoodati
 */

import java.util.Scanner;
 public class Switchcase {
public static void main(String[] args) {
//taking input from user
Scanner sc=new Scanner(System.in);
System.out.print ("Enter name:");
String name=sc.nextLine();
sc.close(); 
//switch case statement
switch(name){
case "rohit":System.out.println("switch case is easy for rohit"); 
break;
case "sayan":System.out.println("switch case is easy for sayan"); 
break;
case "arnab":System.out.println("switch case is easy for arnab");
break;
case "rahul":System.out.println("switch case is for rahul");
break;
case "amit":System.out.println("switch case is easy for virat");
break;
case "pritam":System.out.println("switch case is easy for pritam");
break;
default:System.out.println("name not match");
}
}
}
