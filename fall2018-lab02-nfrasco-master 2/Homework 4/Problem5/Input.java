package HW4.Problem5;

import java.util.Scanner;
public class Input {
	int number;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				System.out.print("Enter the integer: ");
		int maximum = input.nextInt();
		PrimeGenerator gen = new PrimeGenerator();
		int c = 2;
		int p;
		System.out.println("Prime numbers are:");
		
		while(c<= maximum)
		{
			p = gen.nextPrime();
			if (p<= maximum )
				System.out.println(p + " ");
			c++;
			
		}
		
		//input.close();
	}
}
