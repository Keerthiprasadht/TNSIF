package com.tnsif.service;

import com.tnsif.dao.StudentDao;
import com.tnsif.dao.StudentDaoImpl;
import com.tnsif.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao dao;
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}
	

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteStudent(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		
		
	}

	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById( id);
		return student;
		
		
	}

}
