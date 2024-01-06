package task8;

import java.util.Scanner;

public class Greaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, sum, sum1;

		Scanner input = new Scanner(System.in); 
		
	      System.out.println("Enter the value of a: "); 
	      a = input.nextInt(); 
	      
	      System.out.println("Enter the value of b: "); 
	      b = input.nextInt();
	       
	      System.out.println("Enter the value of c: "); 
	      c = input.nextInt();
	      
	      System.out.println("Enter the value of d: ");
	      d = input.nextInt();
	      
	      sum = a + b;
	      sum1 = c + d;
	      
	      if(sum > sum1) {
	    	  
	    	  System.out.println("Sum of a and b is greater than c and d.");
	    	  
	      } else {
	    	  
	    	  System.out.println("Sum of a and b is not greater than c and d.");
	      }
	}

}
