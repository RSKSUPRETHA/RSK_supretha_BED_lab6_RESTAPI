package com.gl.student.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.student.Management.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);

}
