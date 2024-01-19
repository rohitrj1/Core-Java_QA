package CollectionPractice;

import java.util.*;
import java.util.List;
import java.util.Set;

public class DemoCollection {
	public static void main(String[] args) {
		
//		final List<String> list = new ArrayList<>();
		
//		list.add("a");
//		list.add("b");
//		System.out.println(list);
		
//		Set<Student> student = new HashSet<>();
		
		List<Student> student = new ArrayList<>();
		
		Student s1 = new Student(101,"Basant");
		Student s2 = new Student(105,"Uasant");
		Student s3 = new Student(102,"Rakesh");
		Student s4 = new Student(109,"Prasant");
		Student s5 = new Student(104,"Santosh");
		Student s6 = new Student(101,"Abhishek");
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		student.add(s6);
		
		Collections.sort(student,new IdComparator());
		
		System.out.println(student);
		
	}

}
