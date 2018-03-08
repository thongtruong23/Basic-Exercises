package baitap;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input a number: ");
		  int num1 = in.nextInt();
		   
		  for (int i=0; i< 10; i++){
		   System.out.println(num1 + " x " + (i+1) + " = " + 
		     (num1 * (i+1)));
		  }
	}

}
