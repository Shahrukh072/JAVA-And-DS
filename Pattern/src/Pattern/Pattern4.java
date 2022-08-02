package Pattern;

import java.util.Scanner;


public class Pattern4 {

	public static void print(int n) {
	Scanner s= new Scanner(System.in);
	int i = 1;
		//int n =s.nextInt();
		
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				System.out.print(n- j+1);
				j=j+1;
				
			}
			System.out.println();
			i=i+1;
			
		}
		

	}

}