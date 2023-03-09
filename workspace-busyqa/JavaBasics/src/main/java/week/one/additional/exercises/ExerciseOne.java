package week.one.additional.exercises;

import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to convert temperature from Fahrenheit to Celsius degree
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the value of the tempearature in Fahrenheit: ");
		double fahrenheit = keyboard.nextDouble();
		
		double celsius = toCelsius(fahrenheit);
		
		System.out.println("Fahrenheit: " + fahrenheit + "\nCelsius: " + celsius);
		
	}

	public static double toCelsius (double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
	
		return celsius;
		
	}
	
}
