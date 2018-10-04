package ailsamEx;
import java.util.Scanner; 
/*
 * Ailsa Mensinger
 * 10-2-18
 */

public class Chap4Exe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		//constant declinations
		double PI = 3.1415926535897932384626433832;
				
		//step one; enter the radius of a circle
		double radius;
		double area = 0;
		//because of the if statement, variables have to have a value rather than just declared because the if statement doesn't guarantee a value.		
				
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextInt();
		area = radius*radius*PI; 
		if (radius > 0) {
		System.out.println(area);
		
		}
		
		//the piece of code (System.out.println(radius);) won't run if it's false (if radius isn't less than zero). If it's anything else than true then it'll run the 
		//else statement down below. 
		else {
		// (==) is the equality testing operator, or equal to; (=) is for assignment. 
		}
		
		//step two: compute the area using the following formula:
		//area = radius*radius*pi
		area = radius*radius*PI;
				
		//step three: display result

	}

}
