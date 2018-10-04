package ailsamEx;
/*
 * Ailsa Mensinger
 * 10-4-18
 */

public class Nested_ifs {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		if (x < y) {
			System.out.println("x is less than y");
			if(z > y) {
				System.out.println("z if greather than y");
			if (x > z) {
				System.out.println("x is greater than z");
			}
				
			}
			else {
				System.out.println("x is greater than z");
				
			}
		}
		else {
			System.out.println("second condition wasn't true");
			
		}

	}

}
