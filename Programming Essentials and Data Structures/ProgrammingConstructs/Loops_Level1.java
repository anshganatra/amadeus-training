import java.util.*;

public class Loops_Level1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five",
				"Six", "Seven", "Eight", "Nine"}; 
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int len = 0;
		List<String> digits = new ArrayList<String>();
		while(num>0) {
			digits.add(numbers[num%10]);
			num /= 10;
			len += 1;
		}
		while(len>0) {
			System.out.print(digits.get(len-1) + " ");
			len--;
		}
		sc.close();
	}

}
