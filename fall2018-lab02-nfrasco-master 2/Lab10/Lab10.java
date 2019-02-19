import java.util.*;

public class Lab10 {
	
	public static LinkedList<Integer> union;
	public static LinkedList<Integer> intersection;
	
	public static void union(ListIterator<Integer> a, ListIterator<Integer> b) {
		LinkedList<Integer> union = new LinkedList<Integer>();
		
		while(a.hasNext()) {
			union.add(a.next());
		}
		
		while(b.hasNext()) {
			union.add(b.next());
		}
		
		System.out.println("The union of A and B is: " + union); //union part
		
	}
	
	
	public static void intersection(LinkedList<Integer> a, LinkedList<Integer> b) {
		LinkedList<Integer> intersection = new LinkedList<Integer>();
		
		ListIterator<Integer> one = a.listIterator();
		ListIterator<Integer> two = b.listIterator();
	
	for (Integer num: a) {
		if (b.contains(num)) {
			intersection.add(num);
		}
		}
	
	System.out.println("The Intersection of A and B is: " + intersection); //intersection part
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> ListOne = new LinkedList<Integer>();
		LinkedList<Integer> ListOne_two = new LinkedList<Integer>();
		ListIterator<Integer> iterator = ListOne.listIterator();
		ListIterator<Integer> iterator_two = ListOne_two.listIterator();
		
		iterator.add(1);
		iterator.add(2);
		iterator.add(3);
		iterator_two.add(2);
		iterator_two.add(3);
		iterator_two.add(6);
		iterator = ListOne.listIterator();
		iterator_two = ListOne_two.listIterator();
		union(iterator,iterator_two);
		intersection(ListOne,ListOne_two);
	}
	
	}
