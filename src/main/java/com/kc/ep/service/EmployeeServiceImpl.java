/*
 * Copyright (c) Kratagya Chandra.
 */
package com.kc.ep.service;

import com.kc.ep.model.Employee;
import com.kc.ep.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  @Override
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }
  
  @Override
  public List<Employee> getAllEmployees(String sortKey) {
    return employeeRepository.findAll(Sort.by(sortKey));
  }
}
