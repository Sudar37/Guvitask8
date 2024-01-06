package task8;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person:");
		age=sc.nextInt();
		
		if (age < 18) {
			
			System.out.println("You are Kid.");
			
		} else if (age > 60) {
			
			System.out.println("You are Senior Citizen.");
			
		} else {
			System.out.println("You are Adult.");
		}

		
	}

}
