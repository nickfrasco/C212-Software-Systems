import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		float number = Float.parseFloat(in.nextLine());
		
		if (number >= 3.85) {
			System.out.println("A");
			
		} else if (number >= 3.5) {
			System.out.println("A-");
	
		} else if (number >= 3.15) {
			System.out.println("B+");
			
		} else if (number >= 2.85) {
			System.out.println("B");
			
		} else if (number >= 2.5) {
			System.out.println("B-");
			
		} else if (number >= 2.15) {
			System.out.println("C+");
			
		} else if (number >= 1.85 ) {
			System.out.println("C");
			
		} else if (number >= 1.5 ) {
			System.out.println("C-");
			
		} else if (number >= 1.15 ) {
			System.out.println("D+");
			
		} else if (number >= 0.55) {
			System.out.println("D");
			
		} else { 
				System.out.println("F");
			}
		}

	}


