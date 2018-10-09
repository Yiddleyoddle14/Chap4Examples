package ailsamEx;
import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 10-9-18
 */

public class RandomSubtractionGame {

	public static void main(String[] args) {
		
		//import scanner
		Scanner input = new Scanner(System.in);
		
		//declare variables for numbers being subtracted
		int num1 = (int)(System.currentTimeMillis() % 10 );
		int num2 = (int)(System.currentTimeMillis() /3 % 10);
		
		//Create if statement to make sure there are no negative answers
		if (num1 > num2) {
			System.out.println(num1 + " - " +num2 + " = ? ");
		}
		
		else if (num1 < num2) {
			System.out.println(num2 + " - " +num1 + " = ?"); 
		}
		
		
		//Declare variables for the user's answer and the actual answer
		int studentAnswer = input.nextInt();
		int correctAnswer = (num1 - num2);
		
		if (num1 > num2) {
			correctAnswer = (num1 - num2);
		}
		else if (num1 < num2) {
			correctAnswer = (num2 - num1);
		}
		
		if (studentAnswer == correctAnswer) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Incorrect! Correct answer: " +correctAnswer);
			System.out.println("Game over!");
			
		}
		
		
		
		
		
		

	}
}


