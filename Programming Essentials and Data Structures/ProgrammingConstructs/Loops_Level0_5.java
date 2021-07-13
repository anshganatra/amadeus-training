import java.util.*;
import java.lang.Math;

public class Loops_Level0_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if(i%4 != 0) {
				System.out.print((int)Math.pow(i, 2) + " ");
			}
		}
		sc.close();
	}
}
