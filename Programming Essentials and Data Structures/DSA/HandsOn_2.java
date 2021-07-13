import java.util.Arrays;
import java.util.Scanner;

public class HandsOn_2 {
	
	public static int binarySearch(int[] nums, int element) {
		return Arrays.binarySearch(nums, element);
	}

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
		Arrays.sort(nums);
		System.out.println("Array of numbers entered in sorted manner: ");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println("\nEnter number to search: ");
		int element = sc.nextInt();
		
		int index = HandsOn_2.binarySearch(nums, element);
		if (index < 0) {
			System.out.println("Eement not found!");
		}
		else {
			System.out.println("Element found at index: " + index);
		}
		sc.close();

	}

}
