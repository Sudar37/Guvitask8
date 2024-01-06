package task8;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, swap;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a value of x: ");
        x = in.nextInt();
        
        System.out.print("Enter a value of y: ");
        y = in.nextInt();
		
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        swap = x;
        x = y;
        y = swap;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
	}

}
