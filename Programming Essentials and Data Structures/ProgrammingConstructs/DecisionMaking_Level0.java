import java.util.*;

public class DecisionMaking_Level0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		if (num%2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
		sc.close();
	}

}
