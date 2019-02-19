package HW4.Problem2;
import java.util.Scanner;

public class HW4Problem2 {
	public static void main(String[] args) {
		double value;
		Scanner scanner = new Scanner(System.in);
		DataSet ds = new DataSet();
		System.out.println("Enter a value or '0' to quit and see results: ");
		value = scanner.nextDouble();
		
		while(value != 0)
		{
			ds.add(value);
			System.out.println("Enter a value or 0 to quit and see results: ");
			value = scanner.nextDouble();
			
		}
		System.out.println("Average of values: " + ds.getAverage());
		System.out.println("Standard Deviation : " + ds.getStandardDeviation());
		
	}
	}

	
