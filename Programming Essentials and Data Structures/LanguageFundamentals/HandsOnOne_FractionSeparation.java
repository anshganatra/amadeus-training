/*
 * QUESTION 4
 * 
 * Write a program to accept a double value. Separate the 
 * whole value from the fractional value and store them in 
 * two variables. Display the same 
 * 
 */

import java.util.*;

public class HandsOnOne_FractionSeparation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Double Number: ");
		double a = sc.nextDouble();
		int whole = (int)a;
		float fractional = (float)(a - whole);
		System.out.println("Whole Part: " + whole);
		System.out.println("Fractional Part: " + fractional);	
		sc.close();
		
	}

}
