package Recursion3;

import java.util.Scanner;

public class PrintKeypad {
	public static String getOptions(int digit) {
		if(digit == 2) {
			return "abc";
		}
		if(digit == 3) {
			return "deg";
		}
		if(digit == 4) {
			return "ghi";
		}
		if(digit == 7) {
			return "pqrs";
		}
		return "";
		
	}
	public static void printKeypadCombinations(int input, String stringSoFar) {
		if(input == 0) {
			System.out.println(stringSoFar);
			return;
		}
		int lastDigit = input % 10;
		int smallInput = input/10;
		String optionsLastDigit = getOptions(lastDigit);
		for(int i = 0; i < optionsLastDigit.length(); i++) {
			printKeypadCombinations(smallInput, optionsLastDigit.charAt(i) + stringSoFar);
		}
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int input = s.nextInt();
		printKeypadCombinations(input, "");

	}

}
