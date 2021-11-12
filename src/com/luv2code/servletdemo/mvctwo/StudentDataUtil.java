package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudent(){
		
		// create the empty list
		List<Student> studentsData = new ArrayList<Student>();
		
		// add the sample data
		studentsData.add(new Student("Prashant", "Balwan", "abc@gmail.com"));
		studentsData.add(new Student("Amit", "Tomer", "xyz@gmail.com"));
		studentsData.add(new Student("Ashish", "Tomer", "pqr@gmail.com"));
		studentsData.add(new Student("Priya", "Singh", "pst@gmail.com"));
		studentsData.add(new Student("Smaeeksha", "Dandriyal", "lmn@gmail.com"));
		
		// return the list
		return studentsData;
	}
}
