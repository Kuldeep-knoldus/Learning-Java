package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

public interface SaveEmployeeService {
    public void saveEmployee(Employee employee);

    int  getEmployeeCount();
}
