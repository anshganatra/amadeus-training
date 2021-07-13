import java.util.*;

public class Nested_Level0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
