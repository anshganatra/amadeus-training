import java.util.*;

public class Nested_Level2 {
	static int factorial(int n) {
		if(n==0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		if (n>=0)
			System.out.println("Factorial of " + n + ": " + factorial(n));
		else
			System.out.println("Invalid Input!");
		sc.close();

	}

}
