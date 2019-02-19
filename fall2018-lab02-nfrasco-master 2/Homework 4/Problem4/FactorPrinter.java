package HW4.Problem4;

public class FactorPrinter {
	public static void main (String[] args) {
		java.util.Scanner scan = new
				java.util.Scanner(System.in);
		System.out.print("Enter a number to find factors: ");
		int number = scan.nextInt();
		FactorGenerator fg = new FactorGenerator(number);
		while(fg.hasMoreFactors())
			System.out.print(fg.nextFactor() + " ");
	}

}
