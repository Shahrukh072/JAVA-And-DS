package Recursion3;

import java.util.Scanner;

public class Recursion {
	public static String[] subsequences(String input) {
		// base case
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
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter String");
		String input = s.next();
		String[] output = subsequences(input);
		for(String outputString: output) {
			System.out.println(outputString);
		}
		
	}

}
