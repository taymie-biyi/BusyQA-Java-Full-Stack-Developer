package WeekOne;

import java.util.Scanner;

public class ExerciseFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program that reads two numbers as input from the keyboard and displays their product on the screen. 
//
//		Hint: Use the Scanner class to read the numbers.

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi pls input your first number here: ");
		 int firstNum = keyboard.nextInt();
		 
		 System.out.println("Now input your second number here: ");
		 int secNum = keyboard.nextInt();
		 
		 System.out.println("Thank you! \nYour first number is: " + firstNum + "\nYour second number is: " + secNum + "\nThe sum of your numbers are: " + (firstNum + secNum));
		
		
		
		
		
		
		
	}

}
