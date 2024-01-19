package com.home.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.home.entity.StudentData;
import com.home.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/save")
	public StudentData saveData(@RequestBody StudentData body) 
	{
		
		return repo.save(body);
		
	}
	
	@GetMapping("/getAll")
	public List<StudentData> getAll()
	{
		
		return repo.findAll();
		
	}
	
	@GetMapping("/getById")
	public Optional<StudentData> getById(@RequestParam int id)
	{
		
		return repo.findById(id);
		
	}
	
	@DeleteMapping("/delById")
	public String deleteById(@RequestParam int id)
	{
		
		repo.deleteById(id);
		
		return "Delete Successful";
		
	}
	
	@PutMapping("/updateData")
	public StudentData updateData(@RequestBody StudentData student)
	{
		
		return repo.save(student);
		
	}
	
	@GetMapping("/getName")
	public List<StudentData> getByName(@RequestParam String name)
	{
		
		return repo.findByName(name);
		
	}
	
	@GetMapping("/getLast")
	public List<StudentData> getByLast(@RequestParam String last)
	{
		
		return repo.findByLast(last);
		
	}
	
	@GetMapping("/getCity")
	public List<StudentData> getByCity(@RequestParam String city)
	{
		
		return repo.findByCity(city);
		
	}
	
	@GetMapping("/getNameAndLast")
	public List<StudentData> getStudent(@RequestParam String name, @RequestParam String last)
	{
		
		return repo.findByNameAndLast(name, last);
		
	}

}
