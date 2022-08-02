package fundamentals;
import java.util.Scanner;
public class Solution {
     public static int findMaxSumSubarrayOfSizeKBruteForce(int[] a, int k) {
        int maxSum = 0, subarraySum;
        for (int i = 0; i <= a.length-k; i++) {
            subarraySum = 0;
            for (int j = i; j < i+k; j++) {
                subarraySum += a[j];
            }
            maxSum = Math.max(maxSum, subarraySum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int k = keyboard.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }

        keyboard.close();

        System.out.printf("Max sum subarray of size %d = %d%n", k, findMaxSumSubarrayOfSizeKBruteForce(a, k));
		
    }
}