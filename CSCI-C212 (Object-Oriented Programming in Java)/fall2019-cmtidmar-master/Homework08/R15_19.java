import java.util.HashSet;

public class R15_19 {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		HashSet<Integer> intersection = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		intersection.addAll(set1);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set1.addAll(set2);
		
		
		System.out.println("Union = " + set1.toString());
		
		set1 = intersection;
		set1.retainAll(set2);
		System.out.println("Intersection = " + set1.toString());
		

	}

}
