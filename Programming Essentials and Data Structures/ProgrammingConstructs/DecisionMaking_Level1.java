/*
 * Given the ambiguous framing, assuming the question requires us to display the 
 * - class of student (1st, 2nd, Pass, Fail)
 * - Average
 * - Total
 * given the name and grades of 3 subjects
 * */

import java.util.*;

public class DecisionMaking_Level1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name: ");
		String name = sc.next();
		System.out.println("Enter the Score for Subject 1: ");
		int score1 = sc.nextInt();
		System.out.println("Enter the Score for Subject 2: ");
		int score2 = sc.nextInt();
		System.out.println("Enter the Score for Subject 3: ");
		int score3 = sc.nextInt();
		int total = score1 + score2 + score3;
		float average = total/3;
		
		String passClass;
		if (average>=60) {
			passClass = "FIRST CLASS";
		} else if (average>=50) {
			passClass = "SECOND CLASS";
		} else if (average>=35) {
			passClass = "PASS";
		} else {
			passClass = "FAIL";
		}
		
		System.out.println("---------------GRADESHEET---------------");
		System.out.println("NAME: " + name);
		System.out.println("SCORE 1: " + score1);
		System.out.println("SCORE 2: " + score2);
		System.out.println("SCORE 3: " + score3);
		System.out.println("TOTAL SCORE: " + total);
		System.out.println("AVERAGE SCORE: " + average);
		System.out.println("PASS CLASS: " + passClass);
		sc.close();
	}

}
