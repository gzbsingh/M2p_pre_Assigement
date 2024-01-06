package com.M2p_Assigement.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.M2p_Assigement.Exception.StudentNotFoundException;
import com.M2p_Assigement.Model.Student;
import com.M2p_Assigement.Repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
	private StudentRepository stsRepo;
	public void updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		Student st=stsRepo.findById(id).orElseThrow(()->new StudentNotFoundException("student not found with this"+id));
		st.setAddress(student.getAddress());
		st.setEmail(student.getEmail());
		st.setMobile(student.getMobile());
		st.setName(student.getName());
		
		stsRepo.save(st);
		
	}

	public void createStudent(Student st) {
		// TODO Auto-generated method stub
		if(st!=null)
		stsRepo.save(st);
		else
		 new  NullPointerException("Please Enter details"+st);	
	}

	
}
