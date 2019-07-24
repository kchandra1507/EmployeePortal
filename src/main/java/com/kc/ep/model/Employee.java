/*
 * Copyright (c) Kratagya Chandra.
 */
package com.kc.ep.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Employee")
@ApiModel(description = "All details about Employee.")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(notes = "The generated employee ID")
  private Long id;

  @NotEmpty
  @Column(name = "FirstName")
  @ApiModelProperty(notes = "The employee first name")
  private String firstName;

  @Column(name = "LastName")
  @ApiModelProperty(notes = "The employee last name")
  private String lastName;

  @Column(name = "Salary")
  @ApiModelProperty(notes = "The employee salary")
  private double salary;

  @Column(name = "JoiningDate")
  @ApiModelProperty(notes = "The employee joining date in `yyyy-MM-dd` format")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate joiningDate;

  @Column(name = "Department")
  @ApiModelProperty(notes = "The employee department")
  private String department;

  @Column(name = "EmailId")
  @ApiModelProperty(notes = "The employee email id")
  private String emailId;

  @Column(name = "PhoneNo")
  @ApiModelProperty(notes = "The employee phone number")
  private String phoneNo;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public LocalDate getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(LocalDate joiningDate) {
    this.joiningDate = joiningDate;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }
}
