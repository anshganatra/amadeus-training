import java.util.*;

public class Loops_Level3 {
	
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n == 2) {
			return true;
		}
		else {
			for (int i = 3; i <= n/2; i+=2) {
				if(n % i == 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n: ");
		int n = sc.nextInt();
		System.out.println("m: ");
		int m = sc.nextInt();
		sc.close();
		int sum = 0;
		
		for (int i = n; i <= m; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
