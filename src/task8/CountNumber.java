package task8;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
	    num = sc.nextInt();
	    
	    while(num!=0)
	    {
	         num = num/10;
	         count++;
	      }
	      System.out.println("\nThe Total Number of Digits =  "+count);
	      
	}

}
