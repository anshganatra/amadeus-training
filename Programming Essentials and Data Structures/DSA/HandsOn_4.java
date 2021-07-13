import java.util.Scanner;

public class HandsOn_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print("Enter (" + i + "," + j + "): ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatrix:");
		for (int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		boolean isIdentity = true;
//		System.out.println("\nTranspose:");
		for (int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if((i == j) && (arr[i][j] != 1)) {
					isIdentity = false;
				}
				if((i != j) && (arr[i][j] != 0)) {
					isIdentity = false;
				}
				
			}
		}
		if(isIdentity) {
			System.out.println("\nGiven matrix is Identity Matrix!");
		} else {
			System.out.println("\nGiven matrix is NOT Identity Matrix!");
		}
		
		sc.close();

	}

}
