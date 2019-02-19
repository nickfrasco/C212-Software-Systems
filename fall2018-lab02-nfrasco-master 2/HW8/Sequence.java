import java.util.ArrayList; 

public class Sequence {
	
	public static void main(String[] args) {
		ArrayList<Integer> input = newInput();
		System.out.println("Original: " + input);
		
		input = Sequence(input);
		System.out.println("Sorted: " + input);
		
	}
	
	private static ArrayList<Integer> Sequence(ArrayList<Integer> input) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (input.size() == 1) {
			return input;
		}
		
		if (input.size() == 2) {
			return swap(input);
		}
		int split = (input.size()+1)/2;
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		for (int i = 0; i < split; i++) {
			left.add(input.get(i));
		}
		ArrayList<Integer> right = new ArrayList<Integer>();
		for (int i = split; i < input.size(); i++) {
			right.add(input.get(i));
		}
		left = Sequence(left);
		right = Sequence(right);
				
		result = merge(left, right);
		
		return result;
		
	}
	private static ArrayList<Integer> merge(ArrayList<Integer> input1, ArrayList<Integer> input2) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int a = 0, b = 0, Res = 0;
		
		while(a < input1.size() && b < input2.size()) {			
			if(input1.get(a) < input2.get(b)) {
				result.add(Res++, input1.get(a++));
			} else {
				result.add(Res++, input2.get(b++));
			}			
		}
		
		while (a < input1.size()) { 
			result.add(Res++, input1.get(a++));
		}
		
		while (b < input2.size()) {
			result.add(Res++, input2.get(b++));
		}
		
		return result;
	} 

	private static ArrayList<Integer> swap(ArrayList<Integer> input) {
		int min = Math.min(input.get(0), input.get(1));
		int max = Math.max(input.get(0), input.get(1));
	
		input.set(0, min);
		input.set(1, max);
	
		return input;		
}
	private static ArrayList<Integer> newInput () {
		ArrayList<Integer> input = new ArrayList<Integer> ();
		
		input.add(4);
		input.add(5);  
		input.add(2); 
		input.add(3); 
		input.add(1); 
		input.add(7);
		input.add(6);
		
		return input;
	}
}