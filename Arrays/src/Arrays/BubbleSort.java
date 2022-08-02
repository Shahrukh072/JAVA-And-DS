package Arrays;

public class BubbleSort {
	public static void printArray(int[]x) {
		int n =x.length;
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}
	}
	public static void bubbleSort(int [] x) {
		int n = x.length;
		for(int i=0; i<n-1; i++) {
			for (int j=0; j<n-1-i; j++) {
				if (x[j] > x[j+1]) {
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
					
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		int x[] = {1,7,4,3,9,2,6};
		bubbleSort(x);
		printArray(x);
		
	}
}
