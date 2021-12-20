package homework_11;
/*
 *	 E18.6: Implement a generic version of the selection sort algorithm
 *
 */

public class E18_6 { 
	public static void main(String a[]){  
		int[] arr1 = {9,14,3,2,43,11,58,22};  
		System.out.print("Before Selection Sort: {9,14,3,2,43,11,58,22}");  
		selectionSort(arr1);
		System.out.print(", After Selection Sort: ");  
		for(int i:arr1){  
			System.out.print(i + " "); 
			}  
		
		System.out.println();
		
		int[] arr2 = {2, 5, 3, 7, 4, 9, 1};
		System.out.print("Before Selection Sort: {2, 5, 3, 7, 4, 9, 1}");   
		selectionSort(arr2);
		System.out.print(", After Selection Sort: ");  
		for(int i:arr2){  
			System.out.print(i + " "); 
		}  
	}  
	public static void selectionSort(int[] arr){			
		for (int i = 0; i < arr.length - 1; i++) {  
			int index = i;  
			for (int j = i + 1; j < arr.length; j++){  
				if (arr[j] < arr[index]){  
					index = j;
				}  
			}  
			int smallerNumber = arr[index];
			arr[index] = arr[i];  
			arr[i] = smallerNumber;  
		}  
	}  

}  
