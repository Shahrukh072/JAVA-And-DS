package Arrays;

public class PrintAllPairs {
	public static void printAllpairs(int[] x) {
		int n=x.length;
		for(int i=0; i<n-1;i++) {
			for (int j=i+1; j<n; j++) {
				System.out.println("(" + x[i] +"," + x[j] + ")");
			}
		}
	}

	public static void main(String[] args) {
		int[] x= {1,4,7,6,5};
		printAllpairs(x);
		

	}

}
