package Recursion;

public class CNArray {
	public static boolean isSorted(int a[]) {
		if(a.length ==1) {
			return true;
		}
		if(a[0]>a[1]) {
			return false;
		}
		int smallArray[] = new int[a.length-1];
		for(int i=1; i<a.length;i++) {
			smallArray[i - 1] = a[i];
		}
		boolean isSmallArraySorted = isSorted(smallArray);
		return isSmallArraySorted;
	}
	public static boolean isSortedBetter(int a[], int si) {
		if(si == a.length-1) {
			return true;
		}
		if(a[si]> a[si+1]) {
			return false;
		}
		boolean isSmallArraySorted = isSortedBetter(a, si+1);
		return isSmallArraySorted;
	}
	public static int firstIndex(int a[], int x) {
		if(a.length==0) {
			return -1;
		}
		if (a[0]==x) {
			return 0;
		}
		int smallArray[] = new int[a.length-1];
		for(int i=1; i<a.length;i++) {
			smallArray[i - 1] = a[i];
		}
		int fi = firstIndex(smallArray, x);
		if(fi==-1) {
			return -1;
		}else {
			return fi+1;
		}
		
	}
	public static int firstIndexBetter(int a[],int x, int si) {
		if(si==a.length) {
			return -1;
		}
		if(a[si]==x) {
			return si;
		}
		int k = firstIndexBetter(a,x,si+1);
		return k;
	}
	
	public static int lastIndex(int a[], int x) {
		if(a.length==0) {
			return -1;
		}
		int smallArray[] = new int[a.length-1];
		for(int i=1; i<a.length;i++) {
			smallArray[i - 1] = a[i];
		}
		int k = lastIndex(smallArray, x);
		if(k != 1) {
			return k+1;
		}else {
			if(a[0]==x) {
				return 0;
			}else {
				return -1;
			}
		}
	}
	public static int lastIndexBetter(int a[], int x, int si) {
		if(si==a.length) {
			return -1;
		}
		int k = lastIndexBetter(a,x,si+1);
		if(k != -1) {
			return k;
		}else {
			if(a[si]==x) {
				return si;
			}else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println();

	}

}
