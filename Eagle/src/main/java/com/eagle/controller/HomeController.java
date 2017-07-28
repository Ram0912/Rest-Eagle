package com.eagle.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.eagle.model.StudentPD;
import com.eagle.model.StudentSD;
import com.eagle.service.ServiceI;
@CrossOrigin
@RestController
@RequestMapping("/eagle")
public class HomeController {

	     //sample endpoint--- localhost:8080/rest/eagle

		final static Logger logger = Logger.getLogger(HomeController.class);

		@Autowired
		private ServiceI serviceI;
		

		// Route Controller
		
		/*
		 * @GetMapping--specifies GET method
		 * @PostMapping--specifies POST method
		 * @PutMapping--specifies PUT method
		 * @DeleteMapping--specifies DELETE method
		 */
		
		@GetMapping("/getStudentpdbyID/{id}")   //sample endpoint---- localhost:8080/rest/bus/route/{id}
		public ResponseEntity<StudentPD> getStudentPDById(@PathVariable("id") String id) {
			StudentPD studentpd = serviceI.getStudentPDById(id);
			return new ResponseEntity<StudentPD>(studentpd, HttpStatus.OK);
		}
		
		@GetMapping("/getAllStudentpd")
		public ResponseEntity<List<StudentPD>> getAllStudentPDs() {
			List<StudentPD> list = serviceI.getAllStudentPDs();
			return new ResponseEntity<List<StudentPD>>(list, HttpStatus.OK);
		}

		@PostMapping("/addStudentpd")
		public ResponseEntity<Void> addStudentPD(@RequestBody StudentPD studentpd, UriComponentsBuilder builder) {
			boolean flag = serviceI.addStudentPD(studentpd);
			if (flag == false) {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(builder.path("/getStudentpdbyID/{id}").buildAndExpand(studentpd.getStudentId()).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@PutMapping("/updateStudentpd")
		public ResponseEntity<StudentPD> updateStudentPD(@RequestBody StudentPD studentpd) {
			serviceI.updateStudentPD(studentpd);
			return new ResponseEntity<StudentPD>(studentpd, HttpStatus.OK);
		}

		@DeleteMapping("/deleteStudentpd/{id}")
		public ResponseEntity<Void> deleteStudentPD(@PathVariable("id") String id) {
			serviceI.deleteStudentPD(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		
		//Student Syllabus Details Controller
		
		@GetMapping("/getStudentsdbyID/{id}")   //sample endpoint---- localhost:8080/rest/bus/route/{id}
		public ResponseEntity<StudentSD> getStudentSDById(@PathVariable("id") String id) {
			StudentSD studentsd = serviceI.getStudentSDById(id);
			return new ResponseEntity<StudentSD>(studentsd, HttpStatus.OK);
		}
		
		@GetMapping("/getAllStudentsd")
		public ResponseEntity<List<StudentSD>> getAllStudentSDs() {
			List<StudentSD> list = serviceI.getAllStudentSDs();
			return new ResponseEntity<List<StudentSD>>(list, HttpStatus.OK);
		}

		@PostMapping("/addStudentsd")
		public ResponseEntity<Void> addStudentSD(@RequestBody StudentSD studentsd, UriComponentsBuilder builder) {
			boolean flag = serviceI.addStudentSD(studentsd);
			if (flag == false) {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(builder.path("/getStudentsdbyID/{id}").buildAndExpand(studentsd.getStudentId()).toUri());
			return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		}

		@PutMapping("/updateStudentsd")
		public ResponseEntity<StudentSD> updateStudentSD(@RequestBody StudentSD studentsd) {
			serviceI.updateStudentSD(studentsd);
			return new ResponseEntity<StudentSD>(studentsd, HttpStatus.OK);
		}

		@DeleteMapping("/deleteStudentsd/{id}")
		public ResponseEntity<Void> deleteStudentSD(@PathVariable("id") String id) {
			serviceI.deleteStudentSD(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		
}
