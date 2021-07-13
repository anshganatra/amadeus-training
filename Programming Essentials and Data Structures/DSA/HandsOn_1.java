import java.util.*;

public class HandsOn_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Index " + i + ": ");
			nums[i] = sc.nextInt();
		}
		System.out.println("Array of numbers entered: ");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println("\nEnter number to search: ");
		int element = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(nums[i] == element) {
				System.out.println("Element found at Index " + i);
				break;
			}
			if(i==n-1) {
				System.out.println("Element not found!");
			}
		}
		sc.close();

	}

}
