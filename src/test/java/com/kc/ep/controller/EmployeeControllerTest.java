package com.kc.ep.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import com.kc.ep.model.Employee;
import com.kc.ep.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
  @Mock
  EmployeeService employeeService;

  @InjectMocks
  EmployeeController employeeController;

  @Test
  public void getAllEmployees_whenCalled_shouldReturnListOfEmployees() throws Exception {
    List<Employee> ls = new ArrayList<>();
    Employee emp = new Employee();
    emp.setFirstName("Kratagya");
    ls.add(emp);
    when(employeeService.getAllEmployees()).thenReturn(ls);

    List<Employee> allEmployees = employeeController.getAllEmployees();
    assertEquals(1, allEmployees.size());

  }

  @Test
  public void getAllEmployeesBySortKey_whenCalled_shouldReturnListOfEmployees() throws Exception {
    List<Employee> ls = new ArrayList<>();
    Employee emp1 = new Employee();
    emp1.setFirstName("Kratagya");
    Employee emp2 = new Employee();
    emp2.setFirstName("Priya");
    ls.add(emp1);
    ls.add(emp2);
    when(employeeService.getAllEmployees("firstName")).thenReturn(ls);

    List<Employee> allEmployees = employeeController.getAllEmployees("firstName");
    assertEquals(2, allEmployees.size());

  }
}
