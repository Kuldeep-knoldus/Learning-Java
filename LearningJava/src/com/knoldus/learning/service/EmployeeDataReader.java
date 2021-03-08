package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.io.FileNotFoundException;
import java.util.List;

public interface EmployeeDataReader {
    public List<Employee> readEmployeeDataFromCSV() throws FileNotFoundException;
}