package com.gl.student.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.student.Management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}