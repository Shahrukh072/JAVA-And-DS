package Recursion3;

import java.util.Scanner;

public class PrintSubsewuences {
	
	public static String[] subsequences(String input) {
		if(input.length() == 0) {
			String[] output = new String[1];
		   output[0] = "";
		   return output;
		}
		
		String[] smalloutput = subsequences (input.substring(1));
		String[] output = new String[smalloutput.length * 2];
		for(int i =0; i < smalloutput.length; i++) {
			output[i] = smalloutput[i];
		}
		for(int i =0; i < smalloutput.length; i++) {
			output[smalloutput.length + i] = input.charAt(0) + smalloutput[i];
		}
		return output;
	}
	
	public static void printSubsequences(String input, String stringSoFar) {
		if(input.length() == 0) {
			System.out.println(stringSoFar);
			return;
		}
		String smallInput = input.substring(1);
		printSubsequences(smallInput, stringSoFar);
		printSubsequences(smallInput, stringSoFar + input.charAt(0));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		printSubsequences(input, "");
//		String[] output = subsequences(input);
//		for(String outputString: output) {
//			System.out.println(outputString);
//		}

	}

}
