/*
 * QUESTION 3
 * 
 *  Write a program to accept a number and display whether
 *  it is an even or odd number (Note: Don't use If else statement) 
 * 
 */

import java.util.*;

public class HandsOnOne_OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		System.out.println(a%2 == 0 ? "EVEN" : "ODD");
		sc.close();
	}

}
