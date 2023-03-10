package week.one.additional.exercises;

import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a random number between 0 and 1000: ");
		int num = keyboard.nextInt();
		
		int rem;
		
		int rand = 0;
				
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			
			rand = rand + rem;

		}
		
		System.out.println("The sum total of your chosen number is: " + rand);
		
	}

}
