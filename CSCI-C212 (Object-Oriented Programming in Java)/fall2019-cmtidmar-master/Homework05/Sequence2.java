package homework_05;
import java.util.ArrayList;
import java.util.Iterator;

public class Sequence2 {
	   public ArrayList<Integer> values;
	   
	   public Sequence2(int size) { 
		   values = new ArrayList<Integer>(size); }
	   
	   public void add(int num) {
		   values.add(num); }
	   
	   public String toString() { 
		   return values.toString(); }
	   
	   // E7.22
	   public Sequence2 append(Sequence2 other){
	       Sequence2 sequence1 = new Sequence2(4);
	       Iterator<Integer> it = values.iterator();
	       while(it.hasNext())
	       sequence1.add(it.next());
	      
	       Iterator<Integer> it1 = other.values.iterator();
	       while(it1.hasNext())
	           sequence1.add(it1.next());
	       return sequence1;
	   }
	   
	// E7.23
	   public Sequence2 merge(Sequence2 other){
	       int i = 0;
	       Sequence2 sequenceTwo = new Sequence2(5);
	       Iterator<Integer> int1 = values.iterator();
	       Iterator<Integer> int2 = other.values.iterator();
	       while(int1.hasNext()||int2.hasNext()){
	           if(i < values.size()){
	        	   sequenceTwo.add(int1.next()); }
	           if(i < other.values.size()){
	        	   sequenceTwo.add(int2.next()); }
	       i++; }
	       return sequenceTwo; }
	   
	   // E7.24
	   public Sequence2 mergeSorted(Sequence2 other) {
		   int s1 = values.size(); //first 
		   int s2 = other.values.size(); //second
		   int s3 = s1 + s2; //combined
		   Sequence2 sorted = new Sequence2(s3);
		   
		   int a, b;
		   int i = 0,j = 0;
		   
		   while(i < s1 || j < s2){
			   if(i < s1 && j < s2) {
				   a = values.get(i);
				   b = other.values.get(j);
				   if(a < b) {
					   sorted.add(a);
					   i++; }
		   
				   else {
					   sorted.add(b);
					   j++; }
			   }
		   
			   else if(i < s1) {
				   a = values.get(i);
				   sorted.add(a);
				   i++;
			   }

			   else if(j < s2){
				   b = other.values.get(j);
				   sorted.add(b);
				   j++; }
		   }
		   return sorted;
	   }


	  
	  
	   public static void main(String[] args) {
	       Sequence2 sequence1 = new Sequence2(4);
	       Sequence2 sequence2 = new Sequence2(5);

	       sequence1.add(1); 
	       sequence1.add(4); 
	       sequence1.add(9); 
	       sequence1.add(16);
	       System.out.println("Sequence 1: " + sequence1);
	       
	       sequence2.add(9);
	       sequence2.add(7);
	       sequence2.add(4);
	       sequence2.add(9);
	       sequence2.add(11);
	       System.out.println("Sequence 2: " + sequence2);
	       
	       Sequence2 sequenceAppend = sequence1.append(sequence2);
	       Sequence2 sequenceMerge = sequence1.merge(sequence2);
	       Sequence2 sequenceMergeSorted = sequence1.mergeSorted(sequence2);
	       
	       System.out.println(" ");
	       System.out.println("Append: " + sequenceAppend.toString());
	       System.out.println("Merge: " + sequenceMerge.toString());
	       System.out.println("Merge Sort: " + sequenceMergeSorted.toString());
	       
	   }
	  
}
