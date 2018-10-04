package ailsamEx;
import java.util.Scanner;
/*
 *Ailsa Mensinger
 *10-4-18
 */

public class MultiwayIfStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Please insert ten grades"); 
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		double four = input.nextDouble();
		double five = input.nextDouble();
		double six = input.nextDouble();
		double seven = input.nextDouble();
		double eight = input.nextDouble();
		double nine = input.nextDouble();
		double ten = input.nextDouble();
		double totalAverage = (one + two + three + four + five + six + seven + eight + nine + ten) / 10;
		
		if (totalAverage >= 90) {
			System.out.println("Your grade is an A");
			}
		
		else if (totalAverage >= 80) {
			System.out.println("Your grade is a B");
		}

		else if (totalAverage >= 70) {
			System.out.println("Your grade is a C");
		}
		
		else if (totalAverage >= 60) {
			System.out.println("Your grade is a D");
		}
		else {
			System.out.println("Your grade is an F"); 
		}
		System.out.println("Your average is " +totalAverage); 
		

	}

}
