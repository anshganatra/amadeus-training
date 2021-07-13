import java.util.*;

public class Loops_Level0_4 {

	public static void main(String[] args) {
		//1, 4, 7, 12, 23, 42, 77, … N 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		int a = 1, b = 4, c = 7;
		System.out.print(a + " " + b + " " + c + " ");
		for (int i = 0; i < n - 3; i++) {
			int temp = a + b + c;
			System.out.print(temp + " ");
			a = b;
			b = c;
			c = temp;
		}
		sc.close();
	}

}
