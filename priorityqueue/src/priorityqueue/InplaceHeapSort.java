package priorityqueue;

public class InplaceHeapSort {
	public static void downHeapify(int[] arr, int i, int n) {
		int parentIndex = i;
		int leftchildIndex = 2*parentIndex+1;
		int rightchildIndex = 2*parentIndex+2;
		
		while(leftchildIndex < n) {
			int minIndex = parentIndex;
			if(arr[leftchildIndex] < arr[minIndex]) {
				minIndex = leftchildIndex;
			}
			if(rightchildIndex < n && arr[rightchildIndex] < arr[minIndex]) {
				minIndex = rightchildIndex;
				
			}
			if(minIndex == parentIndex) {
				return;
			}
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			parentIndex = minIndex;
			leftchildIndex = 2*parentIndex+1;
			rightchildIndex = 2*parentIndex+2;
		}
	}
	
	public static void  heapSort(int[] arr) {
		
		//build the heap
		int n = arr.length;
		for(int i = (n/2)-1; i>0; i--) {
			downHeapify(arr,i,n);
		}
		// remove element from starting one by one and put them at respective last position
		for(int i=n-1; i>=0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			downHeapify(arr,0,i);
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,7,3,2,8,9,6,1};
		heapSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
