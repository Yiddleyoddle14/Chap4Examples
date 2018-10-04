package ailsamEx;
import java.util.Scanner;
//Ailsa Mensinger, 10-2-18

public class IfCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//get 2 numbers from the user
		System.out.println("Enter in your first value");
		double num1 = input.nextDouble(); 
		System.out.println("Enter in your second vlaue");
		double num2 = input.nextDouble(); 
		
		//the identifier you would use to declare an operator is 
		
		//get the operator from the user
		System.out.println("Enter in which operator you want: +, -, *, /, or %");
		String operator = input.nextLine();
		
		
		//test the input
		double total = 0;  
		
		if (operator.equals("+") ) {
			 total = num1 + num2;
		}
		else if (operator.equals("-") ) {
			 total = num1 - num2;
		}
		else if (operator.equals("*") ) {
			 total = num1 * num2;
		}
		else if (operator.equals("/") ) {
			total = num1 / num2;
		}
		else if (operator.equals("%") ) {
			total = num1 % num2; 
		}
		else {
			System.out.println("That wasn't an operator"); 
		}
		
		//do the calculations
		
		//output the response
		System.out.println("Your total was: " + total);
		
		

	}

}
