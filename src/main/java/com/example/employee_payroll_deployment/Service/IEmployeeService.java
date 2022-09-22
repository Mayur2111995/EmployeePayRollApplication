package com.example.employee_payroll_deployment.Service;

import com.example.employee_payroll_deployment.Model.Employee;
import com.example.employee_payroll_deployment.Response.EmployeeDto;
import com.example.employee_payroll_deployment.Response.Response;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Response addEmployee(EmployeeDto employeeDto);
    Response getById(int id);
    Response updateEmployee(int id, EmployeeDto employeeDto);
    Response deleteEmployee(int id);
}
