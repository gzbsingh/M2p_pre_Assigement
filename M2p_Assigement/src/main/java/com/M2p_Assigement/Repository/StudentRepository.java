package com.M2p_Assigement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.M2p_Assigement.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer  > {

}
