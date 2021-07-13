/*
 * QUESTION 2
 * 
 * Write a program to accept two numbers. Display the two 
 * numbers. Swap the two numbers and display them again. 
 * 
 */

import java.util.*;

public class HandsOnOne_SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		System.out.println("Numbers before Swapping");
		System.out.printf("a = %d \t b = %d\n", a, b);
		c = a;
		a = b;
		b = c;
		System.out.println("Numbers after Swapping");
		System.out.printf("a = %d \t b = %d\n", a, b);
		sc.close();
	}

}
