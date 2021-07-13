import java.util.*;

public class Nested_Level3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		int a = 1; 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a % 2 != 0 ? a * a + " " : - a * a + " ");
				a+=1;
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
