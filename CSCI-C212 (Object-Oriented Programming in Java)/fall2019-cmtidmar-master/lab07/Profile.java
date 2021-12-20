package lab07;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;


public class Profile {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Votes.txt");
		Scanner inFile = new Scanner(file);
		HashMap<String, Integer> map = new HashMap<> ();
		
		while (inFile.hasNext()) {
			String input = inFile.next();
			if (!map.containsKey(input)) {
				map.put(input,  1);
			} else{
				map.put(input,  map.get(input) + 1);
			}
		}
		Record[] records = new Record[map.size()];
		Iterator<String> iterator = map.keySet().iterator();
		int index = 0;
		while (iterator.hasNext()) {
			String key = iterator.next();
			Record record = new Record(key, map.get(key));
			records[index] = record;
			index++;
		}
		Arrays.sort(records, Collections.reverseOrder());
		for (int i = 0; i < 5; i++) {
			System.out.println(records[i]);
		}
	}
}


class Record implements Comparable<Record> {
	String key;
	int count;
	
	public Record(String key, int count) {
		
	}
	
	public int compareTo(Record other) {
		if (this.count < other.count) {
			return -1;
		} else if (this.count > other.count) {
			return 1;
		} else {
			return 0;
		}
	}
	public String toString(Record other) {
		return  "(" + other.key+ ", " +other.count + ")";
	}
}