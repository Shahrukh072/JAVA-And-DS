package Arrays;

public class SelectionSort {
	public static void printArray(int[]x) {
		int n =x.length;
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}
	}
	public static void selectionSort(int[] x) {
		int n = x.length;
		for(int i=0; i<n-1; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j=i; j<n; j++) {
				if(x[j]<min) {
					min = x[j];
					minIndex = j;
				}
			}
			int temp = x[minIndex];
			x[minIndex] = x[i];
			x[i] = temp;
		}
	}

	public static void main(String[] args) {
		int x[] = {1,6,4,8,0,3};
		selectionSort(x);
		printArray(x);

	}

}
