package fundamentals;
import java.util.Scanner;

public class SumOfNnumbers {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		   int n;
	       n =s.nextInt();
	       int div=2;
	       while(div<=n/2) {
	    	   if(n%div==0) {
	    		   System.out.println("composite");
	    		   return;
	    		   
	    		    }
	    	   div=div+1;
	   
	    		   
	    	   }
	     }
	      
	       
	       
	       
	       
//	       boolean isprime=true; 
//	       while(div<=n-1) {
//	    	   if(n%div==0) {
//	    		   isprime=false;
//	    		   }
//	    	   div=div+1;
//	    	   if(isprime==true) {
//	    		   System.out.println("prime");
//	    		   
//	    	   }else {
//	    		   System.out.println("composite");
//	    	   }
//	    	   
//	       }
	      
		

				
		//sum of natural number
//       int n;
//       int i=1;
//	
//	n =s.nextInt();
//	int sum=0;
//	while(i<=n) {
//		sum=sum+i;
//		i=i+1;
//		}
//	System.out.println(sum);

}
