package ClassObject;

public class ComplexNumber {
	 int Real;
	 int Imaginary;
	public ComplexNumber(int real, int Imaginary) {
		//if(denominator==0) {
		//	denominator = 1;
	//}
		this.Real = real;
		this.Imaginary = Imaginary;
		simplify();
		}
	public void setReal(int num) {
		this.Real = num;
		simplify();
	}
	public int getReal() {
		return Real;
	}
	public void setImaginary(int num) {
		if(num==0) {
			return;
		}
		this.Imaginary = num;
		simplify();
	}
	public int getImaginary() {
		return Imaginary;
	}
	public void simplify() {
		
	}
	public void print() {
		
	}
	public void add(ComplexNumber c2) {
		simplify();
	}
	public void multiply(ComplexNumber c2) {
		simplify();
	}
	 public static  ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		 int newReal = c1.Real * c2.Imaginary + c1.Imaginary * c2.Real;
		 int newImaginary = c1.Imaginary * c2.Imaginary;
		 ComplexNumber c4  = new ComplexNumber(newReal, newImaginary);
		 return  c4;
	 }
}
