package com.example.employee_payroll_deployment.Service;

import com.example.employee_payroll_deployment.Dto.EmployeeDto;
import com.example.employee_payroll_deployment.Dto.Response;
import com.example.employee_payroll_deployment.Model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Response addEmployee(EmployeeDto employeeDto);

    //EmployeeDto AddEmployee(EmployeeDto employeeDto);

    Response getById(int id);
    Response updateEmployee(int id, EmployeeDto employeeDto);
    Response deleteEmployee(int id);

    List<Employee> getByDepartment(String department);

}
