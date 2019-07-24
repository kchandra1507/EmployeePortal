package com.kc.ep.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.kc.ep.model.Employee;
import com.kc.ep.repository.EmployeeRepository;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

	@Mock
	EmployeeRepository employeeRepository;
	
	@InjectMocks
	EmployeeServiceImpl serviceImpl;
	
	@Test
	public void getAllEmployees_whenEmpty_shouldReturnEmptyList() throws Exception {
		//arrange
		when(employeeRepository.findAll()).thenReturn(new ArrayList<>());
		//act
		List<Employee> employees = serviceImpl.getAllEmployees();
		//assert
		assertEquals(0, employees.size());
	}
	
	@Test
	public void getAllEmployees_whenNotEmpty_shouldReturnListOfEmp() throws Exception {
		//arrange
		List<Employee> emps = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setFirstName("Kratagya");
		emps.add(emp1);
		when(employeeRepository.findAll()).thenReturn(emps);
		//act
		List<Employee> employees = serviceImpl.getAllEmployees();
		//assert
		assertEquals(1, employees.size());
	}
	
	@Test
	public void saveEmployee_whenCalled_shouldReturnEmpObject() throws Exception {
		//arrange
		Employee emp1 = new Employee();
		emp1.setFirstName("Kratagya");
		when(employeeRepository.save(emp1)).thenReturn(emp1);
		//act
		Employee employee = employeeRepository.save(emp1);
		//assert
		assertNotNull(employee);
	}
	
}
