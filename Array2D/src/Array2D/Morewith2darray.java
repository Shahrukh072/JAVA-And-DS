package Array2D;

public class Morewith2darray {

	public static void main(String[] args) {
//		int[][] arr = new int[3][5];
//		System.out.println(arr[0][0]);
		
		int [][] arr = new int[4][];
//		System.out.println(arr);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		for(int i=0; i<arr.length; i++) {
//			arr[i] = new int[5];
//		}
//		System.out.println(arr[0][1]);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[i+2];	                  //array initializations
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");			
			}
			System.out.println();
		}
	}

}
