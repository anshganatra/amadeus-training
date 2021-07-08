public class Loops_Level2 {

	public static void main(String[] args) {
		int a = 60; //lcm of 2 3 4 5 6
		// reminder of 1 with 2 3 4 5 6 implies reminder 1 with LCM (=60)
		int count = 0;
		int i = 1;
		while (count<4) {
			if((7 * i) % a == 1) {
				if (count!=2)
						System.out.println(7 * i);
				count +=1;
			}
			i+=1;
		}
		
	}

}
