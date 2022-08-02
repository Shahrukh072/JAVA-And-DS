package Arrays;

public class PrimativeNnonPrimative1 {
	public static void increment(int i) {
		i++;
	}
	public static void printArray(int[]x) {
		int n =x.length;
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}
	}
	public static int[] incrementArray(int[] input) {
		input = new int[7];
		for(int i=0; i<input.length; i++) {
			input[i] =input[i]+1;
		}
		return input;
	}
	
    public static void main(String[] args) {
    	int[] x= {1,2,3,4,5};
    	x=incrementArray(x);
    	printArray(x);
    	
    }

}
