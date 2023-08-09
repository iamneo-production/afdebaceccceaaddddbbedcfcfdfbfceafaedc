package com.examly.springapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Task;
public interface TaskRepo extends CrudRepository<Task,Integer>{

	
}

