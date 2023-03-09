package week.one.additional.exercises;

import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Write a Java program that reads a number in inches, converts it to meters
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input a value in inches");
		double inch = keyboard.nextDouble();
		
		double meter = toMeters(inch);
		
		System.out.println("Inches: " + inch + "\nMeters: " + meter);
		
	}	
		
	public static double toMeters(double inch) {
		return (inch * 0.0254);
		
	}

}
