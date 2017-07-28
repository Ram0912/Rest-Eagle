package com.eagle.service;

import java.util.List;

import com.eagle.model.StudentPD;
import com.eagle.model.StudentSD;

public interface ServiceI {

	//Student Personal Details Implementation
	
	List<StudentPD> getAllStudentPDs();

	// Get students based on ID
	StudentPD getStudentPDById(String studentId);
	
	boolean addStudentPD(StudentPD studentpd);

	void updateStudentPD(StudentPD studentpd);

	void deleteStudentPD(String studentId);
	
	//Student Syllabus Details Implementation
	
	List<StudentSD> getAllStudentSDs();

	// Get students based on ID
	StudentSD getStudentSDById(String studentId);
	
	boolean addStudentSD(StudentSD studentsd);

	void updateStudentSD(StudentSD studentsd);

	void deleteStudentSD(String studentId);
}
