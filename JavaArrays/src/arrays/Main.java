package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
		// initialize an array of ints with one 
		int [] intArray = new int[1];
		
		System.out.println(intArray[0]);
		
		// char is defaulted to empty space, int is 0, long is 0, double is 0.0, boolean is false, Objects are set to null
		
		String[] strArray = {"0", "1", "202"};
		
		strArray[1] = "4";
		
		
		System.out.println(strArray[1]);
		
		
		// 2 dimensional array
		String[][] twoDArray = new String[3][2];
		
		System.out.println(twoDArray[0][0]);
		
		//filling 2 dimensional array
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 2; j++) {
				twoDArray[i][j] = "filled";
				System.out.print(twoDArray[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(1, 2);
		list.add(3);
		list.add(0, 0);
		list.add(2, 105);
		
		//list.clear();
		
		list.remove(4);
		
		System.out.println(list.contains(105));
		
		System.out.println("\n");
		
		System.out.println(Arrays.toString(list.toArray()));
		
		convertStringToStringArray();
		
		
		List<String> listFromArray = new ArrayList<String>(Arrays.asList(strArray));
		
		System.out.println(Arrays.toString(strArray));
		
		
		int[] originalArr = {1, 2, 3, 4, 5};
		
		copyIntArray(originalArr);
		
	}
	
	private static void copyIntArray(int[] arr) {
		int[] copy = new int[arr.length];
		
		copy = arr.clone();
		
		System.out.println(Arrays.toString(copy));
		
		// check for reference equality. 'false' determines that they don't refer to the same memory location
		
		System.out.println("Same Reference: " + (arr == copy));
	}
	
	
	private static void convertStringToStringArray() {
		String str = "hello Java";
		
		String[] strArr = str.split("");
		
		System.out.println(Arrays.toString(strArr));
		
	}
	
}








