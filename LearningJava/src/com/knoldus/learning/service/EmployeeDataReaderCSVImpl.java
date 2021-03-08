package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataReaderCSVImpl implements EmployeeDataReader{
    @Override
    public List<Employee> readEmployeeDataFromCSV() throws FileNotFoundException {
        String line = "";
        String splitBy = ",";
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEnployeeServiceImpl();
        List<Employee> emplList = new ArrayList<>();
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/knoldus/learning/database/EmployeeData.csv"));
            while((line = bufferedReader.readLine())!=null)
            {
                String[] employeeDataCSV = line.split(splitBy);
                Employee employee = new Employee(Integer.parseInt(employeeDataCSV[0]) , employeeDataCSV[1]);
                emplList.add(employee);
            }
        }
        catch(IOException ioException)
        {
            ioException.printStackTrace();
        }
        return emplList;
    }
}