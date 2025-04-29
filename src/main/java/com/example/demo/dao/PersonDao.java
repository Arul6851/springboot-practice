package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {

	int insertPerson(UUID id, Person person);
	
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	
	 public List<Person> getAllPeople(); 
	 
	 Optional<Person> selectPersonByID(UUID id);
	 
	 int deletePersonByID(UUID id);
	 
	 int updatePersonByID(UUID id, Person person);
}
