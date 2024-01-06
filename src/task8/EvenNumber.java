package task8;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is Even number.");
        else
            System.out.println(num + " is Odd number.");
	}

}
