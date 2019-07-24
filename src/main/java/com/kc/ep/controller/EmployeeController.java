/*
 * Copyright (c) Kratagya Chandra.
 */
package com.kc.ep.controller;

import com.kc.ep.model.Employee;
import com.kc.ep.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/api/v1/employee")
@RestController
@Api(value = "EmployeeController")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping
  @ApiOperation(value = "Returns list of all employees")
  public List<Employee> getAllEmployees() {
    return employeeService.getAllEmployees();
  }

  @GetMapping("/{sortKey}")
  @ApiOperation(value = "Returns sorted list of all employees based upon sortKey")
  public List<Employee> getAllEmployees(
      @ApiParam(value = "valid porperty of type Employee") @PathVariable String sortKey) {
    return employeeService.getAllEmployees(sortKey);
  }
}
