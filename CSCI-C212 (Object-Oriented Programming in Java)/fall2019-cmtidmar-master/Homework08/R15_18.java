import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class R15_18 {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		Set<Integer> union = new TreeSet<Integer>();
		Set<Integer> intersect = new TreeSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Set 1 : " + set1.toString());
		System.out.println("Set 2 : " + set2.toString());
		Iterator itr1 = set1.iterator();
		Iterator itr2 = set2.iterator();

		while (itr1.hasNext()) {
			Integer set1Str = (Integer) itr1.next();
			itr2 = set2.iterator();
			
		while(itr2.hasNext()){
			Integer set2Str = (Integer) itr2.next();
			if (set2Str.equals(set1Str)) {
				intersect.add(set1Str); }
			}
		}
		
		itr1 = set1.iterator();
		itr2 = set2.iterator();

		while (itr1.hasNext()) {
			union.add(itr1.next());
			}

		while (itr2.hasNext()) {
			union.add(itr2.next());
		}

		System.out.println("Union : " + union.toString());
		System.out.println("Intersection : " + intersect.toString());

	}

}

