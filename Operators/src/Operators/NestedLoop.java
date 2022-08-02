package Operators;

public class NestedLoop {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+1==j) {
					break;
				}
				System.out.println(j+"");
			}
			System.out.println();
		}
		
		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				if(i==j) {
//					break;
//				}
//				System.out.println(j+"");
//			}
//			System.out.println();
//		}
		System.out.println("outside while");

	}

}
