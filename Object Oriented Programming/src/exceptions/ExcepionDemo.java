package exceptions;

public class ExcepionDemo {
	
	public static int fact(int n) throws NegativeNumberException {
		if(n <0) {
			throw new NegativeNumberException();
		}
		int ans = 1;
		for(int i =2; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}
	
	public static int divide (int a , int b) throws DivideByZeroException {
		if(b == 0) {
			throw new DivideByZeroException();
	//		throw new ArithmeticException();
		}
		return a / b;
	}
	

	public static void main(String[] args)  {
//		String s = null;
//		System.out.println(s.length());
        try {
        	// File f = new File();
        	
			divide(10, 1);
			System.out.println(fact(1));
			System.out.println(" with in try");
		} catch (DivideByZeroException e) {
			System.out.println(" Divide by zero exception raised");
			
		//	e.printStackTrace();
		} catch (NegativeNumberException e) {
		    System.out.println(" Negative number Exception");		
		}catch(Exception e) {
			System.out.println(" Generic Exception");
		}finally{
			System.out.println(" Finally");
		}
        System.out.println(" main ");
	}

}
