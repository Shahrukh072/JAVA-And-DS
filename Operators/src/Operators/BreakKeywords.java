package Operators;

public class BreakKeywords {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		while(i<=n) {
			if(i==4) {
				break;
			}
			System.out.println(i);
			i++;
			
		}
		for(int j=1;j<=n;j++) {
			if(j==4) {
				break;
			}
			System.out.println(j);
			
		}
		System.out.println("outside while");
		
		
		
		
		
//		while(i<=n) {
//			if(i==4) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("outside while");

	}

}
