package fundamentals;
import java.util.Scanner;

public class Evenodd {
	public static void Main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		int rem=a%2;
		boolean result=rem==0;
		if(a%2==0) {
			System.out.println(a + "is even");
		}else {
			System.out.println(a + "is odd");
		}
	}
	

}
