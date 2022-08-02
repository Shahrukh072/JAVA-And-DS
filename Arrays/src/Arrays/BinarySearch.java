package Arrays;

public class BinarySearch {
	public static int binarySearch(int[] x, int ele) {
		int s = 0;
		int e = x.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if (x[mid]>ele) {
				e = mid-1;
			}else if(x[mid]< ele) {
				s = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
}

	public static void main(String[] args) {
		int x[] = {1,4,7,10,20,35,40};
		int index = binarySearch(x,7);
		System.out.println("Index is " + index);

	}

}
