/*
 * Copyright (c) Kratagya Chandra.
 */
package com.kc.ep.service;

import com.kc.ep.model.Employee;
import java.util.List;

/**
 * Service class to get and save Employee
 */
public interface EmployeeService {
  public List<Employee> getAllEmployees();

  public List<Employee> getAllEmployees(String sortKey);
}
