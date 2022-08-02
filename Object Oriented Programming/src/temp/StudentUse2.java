package temp;

import ClassObject.Student;

public class StudentUse2 {
	public static void main(String[] args) {

		Student s1;
		s1 = new Student("abc");
		s1.name = "srk";                                //access modifier Public use in diffrent package
		System.out.println(s1.name);
}
}