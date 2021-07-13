import java.util.*;

public class Loops_Level0_6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();
    
        int a = 1, b=1, c;
        System.out.print(a + " ");
        for(int i=0; i<n; i++){
            if(b%3 == 0){
                b++;
            }
            c = 4 * b + a;
            System.out.print(c + " ");
            a = c;
            b++;
        }
    sc.close();

	}

}


