package com.examly.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.dao.*;
import com.examly.springapp.;

@RestController
public class TaskController {

	@Autowired
	TaskRepo repo;
	@PostMapping("saveTask")
	public String saveTask(@RequestBody Task t)
	{
		repo.save(t);
		System.out.println(t.toString());
		return t.toString();
	}
	@GetMapping("/alltasks")
	public List<Task> all()
	{
		System.out.print("hello");
		return (List<Task>) repo.findAll();
	}
	@GetMapping("/deleteTask")
	public void dele(@RequestParam("id") int id){
		repo.deleteById(id);
	}
	@GetMapping("/changeStatus")
	public String st(@RequestParam("id") int id)
	{
	
	
		
		return "completed";
	}
}
