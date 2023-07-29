package com.example.Dms.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Dms.Models.Dog;

public interface DogRepository extends CrudRepository <Dog,Integer>{
	

}
