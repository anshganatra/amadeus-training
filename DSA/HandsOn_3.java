import java.util.*;

public class HandsOn_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M and N: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("Enter (" + i + "," + j + "): ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatrix:");
		for (int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose:");
		for (int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
