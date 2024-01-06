package task8;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5, i, fact = 1;
        
		for(i=1; i<=num; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " +num+ "\n" +fact);
	}

}
