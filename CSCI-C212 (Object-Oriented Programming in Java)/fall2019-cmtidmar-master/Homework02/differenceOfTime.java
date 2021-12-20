package homework_02;

import java.util.Scanner;

public class differenceOfTime {
	
	public static void main(String[] args) {
		Scanner user;
		user = new Scanner(System.in); 
		
		
		System.out.print("Enter the first time: ");
		String first_Time = user.nextLine();
		String firstTime_stringhh = first_Time.substring(0, 2);
		String firstTime_stringmm = first_Time.substring(3, 5);
		
		int firstTime_hh = Integer.parseInt(firstTime_stringhh);
		int firstTime_mm = Integer.parseInt(firstTime_stringmm);
		int t1 = (firstTime_hh * 60 + firstTime_mm);

		
		System.out.print("Enter the second time: ");
		String second_Time = user.nextLine();
		String secondTime_stringhh = second_Time.substring(0, 2);
		String secondTime_stringmm = second_Time.substring(3, 5);
		
		int secondTime_hh = Integer.parseInt(secondTime_stringhh);
		int secondTime_mm = Integer.parseInt(secondTime_stringmm);
		int t2 = (secondTime_hh * 60 + secondTime_mm);
	
		
		int d = (t2 - t1 + 1440)%1440;
		System.out.println(d/60 + " hours and " + d%60 + " minutes.");
		
	}
}
