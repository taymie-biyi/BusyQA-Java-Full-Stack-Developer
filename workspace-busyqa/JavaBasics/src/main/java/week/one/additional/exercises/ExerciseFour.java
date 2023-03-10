package week.one.additional.exercises;

import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the minutes: ");
		
		int mins = scan.nextInt();
		
		int year = toYear(mins);
		
		int days = toDays(mins);
		
		System.out.println("Minutes: " + mins + " is approximately " + year + " years and " +  days + " days");
		
		
		scan.close();
	}

	public static int toYear(int mins) {
		
		return mins / 525600;
		
	}
	
	public static int toDays(int mins) {
		
		int rem = mins % 525600;
		
		return rem / 1440;
		
	}
}
