package com.kc.ep.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.kc.ep.model.Employee;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Test
	public void findAll_whenEmpExists_shouldReturnListOfEmployees() throws Exception {
    	//act
    	List<Employee> employees = employeeRepository.findAll();
    	
    	//assert
    	assertEquals(7, employees.size());
	}
    
    @Test
	public void findAllBySort_whenEmpExists_shouldReturnListOfEmployees() throws Exception {
    	//act
    	List<Employee> employees = employeeRepository.findAll(Sort.by("firstName"));
    	
    	//assert
    	assertEquals(7, employees.size());
    	assertEquals("Anu", employees.get(0).getFirstName());
    	assertEquals("Suyash", employees.get(6).getFirstName());
	}
}
