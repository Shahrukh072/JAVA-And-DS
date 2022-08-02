package generics;

public class Print {
	
	public static <T extends PrintInterface>void PrintArray(T arr[]) {
		for(int i =0; i < arr.length; i++) {
			arr[i].Print();
//			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
//		Integer arr[] = new Integer[5];
//		for(int i =0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//		PrintArray(arr);
//		
//		String arrs[] = new String[5];
//		for(int i =0; i < arr.length; i++) {
//			arrs[i] = "abc";
//		}
//		PrintArray(arrs);
		Vehicle v[] = new Vehicle[5];
		for(int i =0; i < v.length; i++) {
			v[i] = new Vehicle(10*i, "ab");
		}
		PrintArray(v);
		
		Student Students[] = new Student[5];
		for(int i =0; i < Students.length; i++) {
			Students[i] = new Student(10*i + 1);
		}
		PrintArray(Students);

	}

}
