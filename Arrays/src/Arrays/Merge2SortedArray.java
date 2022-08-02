package Arrays;

public class Merge2SortedArray {
	public static void printArray(int[]x) {
		int n =x.length;
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}
	}
	public static int[] merge2SortedArrays( int[] x1,int[]  x2) {
		int m = x1.length;
		int n = x2.length;
		int [] x = new int[m+n];
		int i =0;
		int j = 0;
		int k = 0;
		while(i<m && j<n) {
			if (x1[i]<= x2[j]) {
				x[k] =  x1[i];
				i++;
				k++;
			}else {
				x[k] = x2[j];
				j++;
				k++;
				
			}
		}
		while(i<m) {
			x[k] = x1[i];
			i++;
			k++;
		}
		while(j<n) {
			x[k] = x2[j];
			j++;
			k++;
		}
		return x;
	}

	public static void main(String[] args) {
		int x1[] = {1,4,8,10,13,17};
		int x2[] = { 2,3,5,7,9,11,12};
		int x3[] = merge2SortedArrays(x1,x2);
		printArray(x3);

	}

}
