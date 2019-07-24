/*
 * Copyright (c) Kratagya Chandra.
 */
package com.kc.ep.repository;

import com.kc.ep.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
