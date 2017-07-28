package com.eagle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eagle.dao.Dao;
import com.eagle.model.StudentPD;
import com.eagle.model.StudentSD;

//Service Implementation for route and bus service with the Annotation @Service
	@Service
	public class ServiceImpl implements ServiceI {

		@Autowired
		private Dao dao;

		// Student Personal Details Service Implementation
		
		@Override
		public StudentPD getStudentPDById(String studentId) {
			StudentPD obj = dao.getStudentPDById(studentId);
			return obj;
		}

		@Override
		public List<StudentPD> getAllStudentPDs() {
			return dao.getAllStudentPDs();
		}

		@Override
		public synchronized boolean addStudentPD(StudentPD studentpd) {
			if (dao.studentExists(studentpd.getName(),studentpd.getDob(),studentpd.getAge(),studentpd.getParentName(),studentpd.getContactNo(),studentpd.getContactEmail(),studentpd.getBloodGrp())) {
				return false;
			} else {
				dao.addStudentPD(studentpd);
				return true;
			}
		}

		@Override
		public void updateStudentPD(StudentPD studentpd) {
			dao.updateStudentPD(studentpd);
		}

		@Override
		public void deleteStudentPD(String studentId) {
			dao.deleteStudentPD(studentId);
		}

		
		//Student Syllabus Details Implementation
		
		
		@Override
		public StudentSD getStudentSDById(String studentId) {
			StudentSD obj = dao.getStudentSDById(studentId);
			return obj;
		}

		@Override
		public List<StudentSD> getAllStudentSDs() {
			return dao.getAllStudentSDs();
		}
		@Override
		public synchronized boolean addStudentSD(StudentSD studentsd) {
			if (dao.studentsdExists(studentsd.getDateofjoining(),studentsd.getPresentkyu(),studentsd.getPresentbelt(),studentsd.getLastgradingdate(),studentsd.getNextgradingdate(),studentsd.getKatas()
					,studentsd.getCombinations(),studentsd.getSparingtechniques(),studentsd.getLevel(),studentsd.getKbi(),studentsd.getOpen(),studentsd.getFeepaid(),studentsd.getPendingfee())) {
				return false;
			} else {
				dao.addStudentSD(studentsd);
				return true;
			}
		}

		@Override
		public void updateStudentSD(StudentSD studentsd) {
			dao.updateStudentSD(studentsd);
		}

		@Override
		public void deleteStudentSD(String studentId) {
			dao.deleteStudentSD(studentId);
		}

		
		
}
