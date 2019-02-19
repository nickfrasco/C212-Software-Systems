import java.util.*;

public class Lab10_Two {
	public static Set<Integer> main_union;
	public static Set<Integer>main_intersection;
	
	public static void union(Set<Integer> a, Set<Integer> b) {
		Set<Integer> main_union = new HashSet<Integer>();
		
		for(Integer num: a) {
			main_union.add(num);
		}
		
		for(Integer nums: b) {
			main_union.add(nums);
		}
		
		System.out.println("The Union of A and B is: " + main_union);
	}
	
	public static void intersection(Set<Integer> a, Set<Integer> b) {
		Set<Integer> main_intersection = new HashSet<Integer>();
		
		for(Integer num: a) {
			if(b.contains(num)) {
				main_intersection.add(num);
				
			}
		}
		System.out.println("The Intersection of A and B is: " + main_intersection);
	}
	
	public static void main(String[] args) {
		Set<Integer> staff = new HashSet<Integer>();
		Set<Integer> staff_two = new HashSet<Integer>();
		staff.add(1);
		staff.add(2);
		staff.add(3);
		staff_two.add(2);
		staff_two.add(3);
		staff_two.add(6);
		union(staff,staff_two);
		intersection(staff,staff_two);
		
	}
	

}
