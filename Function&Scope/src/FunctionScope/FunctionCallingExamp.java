package FunctionScope;

public class FunctionCallingExamp {
	public static void b() {
		System.out.println("Inside b");
		
	}
	public static void a() {
		b();
		System.out.println("Inside a");
	}
	
	public static void main(String[] args) {
		a();
		System.out.println("Inside main");
		

	}

}
