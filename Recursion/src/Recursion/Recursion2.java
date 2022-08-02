package Recursion;

public class Recursion2 {
	public static String replaceChar(String s,char a,char b) {
		if(s.length()==0) {
			return s;
		}
		String smalloutput = replaceChar(s.substring(1),a,b);
		if(s.charAt(0)==a) {
			return b + smalloutput;
		}else {
			return s.charAt(0)+ smalloutput;
		}
	}
	//2 program
	public static String replacePi(String s) {
		if(s.length() <=1) {
			return s;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i') {
			//call recursion on string of length n-2
			String smalloutput = replacePi(s.substring(2));
			return "3.14" + smalloutput;
		}else {
			// call recursion on string of length n-1
			String smalloutput = replacePi(s.substring(1));
			return s.charAt(0) + smalloutput;
		}
	}
	// 3 program
	 public static int binarySearch(int a[], int si, int ei, int x) {
		 if(si>ei) {
			 return -1;
		 }
		 int midIndex = (si + ei)/2;
		 if(a[midIndex]==x) {
			 return midIndex;
		 }else if (a[midIndex]< x) {
			 return binarySearch(a,midIndex+1, ei,x);			 
		 }else {
			 return binarySearch(a, si, midIndex-1,x);
		 }
	 }
	 // 4 program
	 public static void  merge(int []s1, int []s2, int []d) {
		 int i = 0;
		 int j = 0;
		 int k = 0;
		 while(i<s1.length && j<s2.length) {
			 if(s1[i] <= s2[j]) {
				 d[k] = s1[i];
				 i++;
				 k++;
			 }else {
				 d[k] = s2[j];
				 k++;
				 j++;
			 }
		 }
		 if(i< s1.length) {
			 while(i< s1.length) {
				 d[k] = s1[i];
				 i++;
				 k++;
			 }
		 }
		 if(j< s2.length) {
			 while(j< s2.length) {
				 d[k] = s2[j];
				 k++;
				 j++;
			 }
		 }
	 }
	 public static void mergeSort(int a[]) {
		 if(a.length <=1) {
			 return;
		 }
		 int b[] =  new int [a.length/2];
		 int c[] = new int [a.length - b.length];
		 for(int i = 0; i< a.length/2; i++) {
			 b[i] = a[i];
		 }
		 for (int i = a.length/2; i< a.length; i++) {
			 c[i - a.length/2] = a[i];
		 }
		 mergeSort(b);
		 mergeSort(c);
		 merge(b, c, a);
	 }
	 // 5 program
	 public static int partition(int a[], int si, int ei) {
		 int pivotElement = a[si];
		 int smallerNumCount =0;
		 for(int i= si+1; i<=ei; i++) {
			 if(a[i]< pivotElement) {
				 smallerNumCount++;
			 }
		 }
		 int temp = a[si + smallerNumCount];
		 a[si + smallerNumCount] = pivotElement;
		 a[si]= temp;
		 int i = si;
		 int j = ei;
		 while(i<j) {
			 if(a[i]< pivotElement) {
				 i++;
			 }else if(a[j] >= pivotElement) {
				 j--;
			 }else {
				 temp = a[i];
				 a[i]= a[j];
				 a[j] = temp;
				 i++;
				 j--;
				 
			 }
		 }
		 return si + smallerNumCount;
	 }
	 public static void quickSort(int a[], int si, int ei) {
		 if(si>= ei) {
			 return;
		 }
		 int pivotIndex = partition(a,si, ei);
		 quickSort(a, si, pivotIndex-1);
		 quickSort(a, pivotIndex+1, ei);
	 }
	 // 6 program
	 public static void towerHanoi(int n, char s, char h, char d) {
		 if(n==1) {
			 System.out.println("move" + n + "th disk from" + s + " to " + d);
			 return ;
		 }
		 towerHanoi(n-1, s, d, h);
		 System.out.println("move" + n + "th disk from" + s + " to " + d);
		 towerHanoi(n-1, h, s, d);
	 }

	public static void main(String[] args) {
		System.out.println(replaceChar("abcxdxex", 'x', 'y'));  //1 program
          System.out.println(replacePi("apiapipipiip"));        // 2 program
//          int a[] = {1,3,4,5,6,8};                                // 3 program
//          System.out.println(binarySearch(a,0,a.length -1, 3));    // 3 program
//          int a[] = {10, 4,5,9,8,6,12,11,7};                          // 4 program
//          mergeSort(a);                                                // 4 program
//          for(int i=0; i< a.length; i++) {                               // 4 program
//        	  System.out.println(a[i]);                                    // 4 program
//          }                                                             // 4 program
//          quickSort(a,0,a.length-1);                                      // 5 program
//          for(int i=0; i< a.length; i++) {                               // 5 program
//        	  System.out.println(a[i]);                                    // 5 program
//          }                                                                // 5 program
          towerHanoi(2, 's', 'h', 'd');
	}

}
