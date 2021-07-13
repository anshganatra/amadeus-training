/*
 * QUESTION 1
 * 
 * Write a program to accept the principle, rate of interest, 
 * and time. Calculate simple interest and display the same.
 * 
 */

import java.util.*;

public class HandsOnOne_SimpleInterest {

	public static void main(String[] args) {
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Prinipal Amount: ");
		float principal = sc.nextInt();
		System.out.println("Enter the Rate of Interest: ");
		float roi = sc.nextFloat();
		System.out.println("Enter the Number of Years: ");
		int duration = sc.nextInt();
		sc.close();
		//calculate SI
		long amount = (long)(principal * (1 + roi * duration / 100));
		//print SI
		System.out.println("Final Amount at the end of given duration: " + amount);
		System.out.println("Simple Interest Earned: " + (amount - principal));
	}

}



