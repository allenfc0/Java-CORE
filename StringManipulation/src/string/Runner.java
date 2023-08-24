package string;

import java.util.Arrays;

public class Runner {
	
	public static void main(String[] args) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		System.out.println("Before");
		
		checkEquality(str1, str2);
		
		System.out.println("After");
		
		str1 += "dev";
		
		checkEquality(str1, str2);
		System.out.println("\n \n \n");
		substringExample();
		System.out.println("\n \n \n");
		stringToChar();
		System.out.println("\n \n \n");
		stringToByteArray();
		System.out.println("\n \n \n");
		byteArrayToString();
		System.out.println("\n \n \n");
		
		
	}
	
	// Check for String immutability
	private static void checkEquality(Object x, Object y) {
		if(x == y) {
			System.out.println("Same reference");
		} else {
			System.out.println("Different reference");
		}
		
	}
	
	private static void substringExample() {
		String str = "substring";
		String str1 = "subjava";
		
		System.out.println("substring for 0 - 3: " + str.substring(0, 3));
		System.out.println("substring for 3 - 9: " + str.substring(3, 9));
		System.out.println("subjava starting from 3: " + str1.substring(3));
	}
	
	private static void stringToChar() {
		String str = "devjournal";
		
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		
		char c = str.charAt(3);
		System.out.println(c);
		
		char[] chars1 = new char[8];
		str.getChars(0, 7, chars1, 1);
		System.out.println(chars1);
	}
	
	private static void stringToByteArray() {
		String str = "Allen";
		byte[] byteArr = str.getBytes();
		
		System.out.println("String to byte Array: " + Arrays.toString(byteArr));
		
	}
	
	private static void byteArrayToString() {
		byte[] byteArray = {'A', 'L', 'L', 'E', 'N'};
		byte[] byteArray1 = {65, 108, 108, 101, 110};
		
		String str = new String(byteArray);
		String str1 = new String(byteArray1);
		
		System.out.println(str);
		System.out.println(str1);
	}
	
	
	
	
	
	
	
	
}
