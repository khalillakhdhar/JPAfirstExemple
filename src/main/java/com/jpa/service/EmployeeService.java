package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.model.EmployeeModel;
import com.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired // code d'arriére plan (sans new)
EmployeeRepository employeeapi;
public EmployeeModel create(EmployeeModel em)
{
	
	return employeeapi.save(em);
	

}
public List<EmployeeModel> read()
{
return employeeapi.findAll();	
}


public EmployeeModel update(EmployeeModel em,int id)
{
	em.setId(id);
	return employeeapi.save(em);

}
public void delete(int id)
{
	employeeapi.deleteById(id);
}
public List<EmployeeModel> searchRecrutement(String recrutement)
{
return employeeapi.findbyRecrutement(recrutement);
}
	
	
	
	
}
