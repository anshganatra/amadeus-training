import java.util.*;
import java.lang.Math;

public class Loops_Level0_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		if (Math.sqrt(n) % 2 != 0) {
			System.out.println("Invalid Input. Enter Square of Even Number to "
					+ "match the pattern");
		} else {
			int i = 0;
			while (i*i <= n) {
				System.out.print(i*i + " ");
				i+=2;
			}
		}
		
		sc.close();
	}

}
