package Arrays;

public class InsertationSort {
	public static void printArray(int[]x) {
		int n =x.length;
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}
	}
	public static void insertationSort(int [] x) {
		int n= x.length;
		for(int i=1; i<n; i++) {
			int j= i-1;
			int temp = x[i];
			while(j>=0 && x[j]>temp) {
				x[j+1] = x[j]; 
				j--;
			}
			x[j+1] = temp;  
		}
	}

	public static void main(String[] args) {
		int [] x = {9,7,6,8,4,5,2,3};
		insertationSort(x);
		printArray(x);

	}

}
