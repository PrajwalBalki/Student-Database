package com.home.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.home.entity.StudentData;

public interface StudentRepo extends JpaRepository<StudentData, Integer> {
	
	List<StudentData> findByName(String name);
	
	List<StudentData> findByLast(String last);
	
	List<StudentData> findByCity(String city);
	
	List<StudentData> findByNameAndLast(String name, String last);

}
