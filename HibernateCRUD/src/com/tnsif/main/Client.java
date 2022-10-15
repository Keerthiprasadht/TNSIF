package com.tnsif.main;

import com.tnsif.entity.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		student.setName("keerthi");
		student.setBranch("ECE");		
		service.addStudent(student);
		
}
}