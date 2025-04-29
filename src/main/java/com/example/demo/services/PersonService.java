package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Service
public class PersonService {

	private final PersonDao persondao;
	
	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao persondao) {
		this.persondao = persondao;
	}
	
	public int addPerson(Person person) {
		return persondao.insertPerson(person);
	}
	
	public List<Person> getAllPeople(){
		return persondao.getAllPeople();
	}
	
	public Optional<Person> getPersonById(UUID id){
		return persondao.selectPersonByID(id);
	}
	
	public int deletePerson(UUID id) {
		return persondao.deletePersonByID(id);
	}
	
	public int updatePerson(UUID id, Person newPerson) {
		return persondao.updatePersonByID(id, newPerson);	}
}
