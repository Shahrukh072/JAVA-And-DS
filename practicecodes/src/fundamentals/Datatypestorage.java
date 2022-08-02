package fundamentals;

import java.util.Scanner;

public class Datatypestorage {
	public static void main (String[] args) {
		Scanner s= new Scanner(System.in);
		double si,principal,rate,time;
		principal=s.nextDouble();
		rate =s.nextDouble();
		time= s.nextDouble();
		si= (principal*rate*time/100);
		System.out.println("Simple Interest="+si);
		
		
		
		//int a,b,c;
		//System.out.println("Enter two integer to calculate their sum:");
		//Scanner  s= new Scanner(System.in);
		//a=s.nextInt();
		//b=s.nextInt();
		//c=s.nextInt();
			
		
//		float f=10.6f;
		//	int i=(int)10.6f;
		
			
		//double d=10.6;
		//int i= (int)10.6;
		//System.out.println(i);
		
		
	
		//char ch='a';
		//int i=ch;
		//ch=(char)i;
		//System.out.println(i);
		
			
		
	//	char ch= 'a';
		//int i=ch;
		//System.out.println(i);
		
		
		
		//char ch = 'a';
		//int i='a'+3;
		//System.out.println(i);
		
		
		
		//int min=Integer.MIN_VALUE;
		//int max=Integer.MAX_VALUE;
		//System.out.println(min+ ""+max);
		
	}

}
