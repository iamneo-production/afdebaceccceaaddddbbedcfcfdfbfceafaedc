package com.examly.springapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.examly.springapp.model.*;
public interface TaskRepo extends CrudRepository<Task,Integer>{

	
}

