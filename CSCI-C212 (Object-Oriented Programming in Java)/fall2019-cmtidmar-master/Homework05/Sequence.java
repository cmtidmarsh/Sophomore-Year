package homework_05;

public class Sequence {
	private int[] values;
	public Sequence (int size){ 
		values = new int[size];
		}
	
	public void set(int i, int num){ 
		values[i] = num; 
		}
	// E7.11
	public boolean equals(Sequence other){
		for(int i = 0; i < values.length; i++) {
			if( values[i] != other.values[i])
				return false;
			}
			return true;
		}
	// E7.12
	public boolean sameValues(Sequence other) {
		boolean val = false;  
		for(int i = 0; i < values.length; i++){
		for(int j = 0; j < values.length; j++){
			if(values[i] == other.values[j] ){
				val = true;
		break;}
		}
		  
		if(val != true)
		return false; }
		return true; }
	
	public static void main(String[] args) {
	    Sequence a = new Sequence(4);
	    Sequence b = new Sequence(5);
	    System.out.println(a.equals(b));
	    System.out.print(a.sameValues(b));

		}

	}

