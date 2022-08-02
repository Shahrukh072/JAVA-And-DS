package Arrays;

public class PrimativeNnonPrimative {
	public static void increment(int i) {
		i++;
	}
	public static void printArray(int[]x) {
		int n =x.length;
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}
	}
	public static void incrementArray(int[] x) {
		for(int i=0; i<x.length; i++) {
			x[i] =x[i]+1;
		}
	}
	
    public static void main(String[] args) {
    	int[] x= {1,2,3,4,5};
    	incrementArray(x);
    	printArray(x);
    	
    }
}
