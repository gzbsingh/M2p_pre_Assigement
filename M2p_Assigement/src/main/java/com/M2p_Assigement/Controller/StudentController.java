package com.M2p_Assigement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.M2p_Assigement.Model.Student;
import com.M2p_Assigement.Service.StudentService;

@RestController
public class StudentController {
  @Autowired
	private StudentService sts;
	

  @PostMapping("/Add")
  ResponseEntity<String> CreatedStudent(@RequestBody Student st){
	//  System.out.println(st);
	  sts.createStudent(st);
	  return new ResponseEntity<String>("Added Succesfully", HttpStatus.CREATED);
  }
  
  @PutMapping("/update/{id}")
	ResponseEntity<String> updateStudent(@PathVariable int id,@RequestBody Student student){
		 sts.updateStudent(id,student);
		return new ResponseEntity<String>("Updated SuccesFully", HttpStatus.ACCEPTED);
	}
}
