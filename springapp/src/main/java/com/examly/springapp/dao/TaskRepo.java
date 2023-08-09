package com.examly.springapp.dao;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepo extends CrudRepository<Task,Integer>{

	
}

