package baitap;

import java.util.Scanner;

public class Bai6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		  Scanner kb = new Scanner(System.in); 
		  System.out.print("Input first number: ");
		  int num1 = kb.nextInt();
		   
		  System.out.print("Input second number: ");
		  int num2 = kb.nextInt();
		   
		 
		  System.out.println(num1 + " + " + num2 + " = " + 
		  (num1 + num2));
		   
		  System.out.println(num1 + " - " + num2 + " = " + 
		  (num1 - num2));
		   
		  System.out.println(num1 + " x " + num2 + " = " + 
		  (num1 * num2));
		   
		  System.out.println(num1 + " / " + num2 + " = " + 
		  (num1 / num2));
		 
		  System.out.println(num1 + " mod " + num2 + " = " + 
		  (num1 % num2));
	}

}
