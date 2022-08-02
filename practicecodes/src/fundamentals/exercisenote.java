package fundamentals;
import java.util.Scanner;

public class exercisenote {
	
		public static void main(String[] args) 
		{
			
			Scanner s=new Scanner(System.in);
			int n;
			  n = s.nextInt();
	         int num=2;
	         
	         
	         while(num<n){
	             if(n%num==0){
	                 System.out.print(num+" ");
	                     
	             }
	             num++;
	         }
	         

			
			
			
			
			
//			int n=s.nextInt();
//	        int si=0,so=0;
//	        while(n!=0)
//	        {
//	            int temp=n%10;
//	            if(temp%2==0)
//	            {si+=temp;}
//	            if(temp%2!=0)
//	            {so+=temp;}
//	            n=(int)(n/10);
//	        }
//		    System.out.println(si+"   "+so);
			
			
			
			
			
			//multiplication table of n
//			int n;
//	        n=s.nextInt();
//	         
//	        for (int i = 1; i <= 10; i++)
//	           
//	        System.out.println(n*i);
			
			
			
	       	//calculate total salary	
	        
//			int base=s.nextInt();
//			String str=s.next();
//			char c=str.charAt(0);
//			int all;
//			if(c==65)
//			{
//				all=1700;
//			}
//			else if(c==66)
//			{
//				all=1500;
//			}
//			else
//			{
//				all=1300;
//			}
//			double totalsalary=((base+(0.20*base)+(0.50*base)+all)-(0.11*base));
//			double p=Math.round(totalsalary);
//			int h=(int)(p);
//			System.out.println(h);
		}
	}



