package Array2D;

import java.util.Scanner;
public class Solution {
    public static int [][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers of rows");
		int rows = s.nextInt();
		System.out.println("Enter the numbers of cols");
		int cols = s.nextInt();
		int [][] mat = new int [rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.println("Enter the element at" + i +"row" + j + "column");
				mat[i][j] = s.nextInt();
			}
		}
		return mat;
	}

	public static void findLargest(int mat[][]){
		int rows = mat.length;
		int cols = mat[0].length;
		int largest = Integer.MIN_VALUE;
		for(int j=0; j<cols; j++) {
			int sum =0;
			for (int i=0; i<rows; i++) {
				sum = sum + mat[i][j];
				}
			if (sum>largest) {
				largest = sum;
			}			
		}
	
	}


public static void main(String[] args) {
		int [][] mat = takeInput();
		 findLargest(mat);
		System.out.println(mat);

	}

}
