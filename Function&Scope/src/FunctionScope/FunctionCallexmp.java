package FunctionScope;

public class FunctionCallexmp {
	public static void c(int n) {
		System.out.println("Inside c" +n);
		n++;
	}
	public static void b(int n) {
		c(n);
		System.out.println("inside b" + n);
		n++;	
	}
	public static void a(int n) {
		b(n);	
	System.out.println("Inside a" + n);
		n++;	
	}

	public static void main(String[] args) {
		int n=10;
		a(n);
		System.out.println("Inside main" + n);
	
	}
}
