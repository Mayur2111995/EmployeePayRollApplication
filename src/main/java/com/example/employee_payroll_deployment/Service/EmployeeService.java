package com.example.employee_payroll_deployment.Service;
import com.example.employee_payroll_deployment.Model.Employee;
import com.example.employee_payroll_deployment.Repository.EmployeeRepository;
import com.example.employee_payroll_deployment.Response.EmployeeDto;
import com.example.employee_payroll_deployment.Response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Response response;
    public List<Employee> getAllEmployees() {
       // return new Response("All Employee Details",100, employeeRepository.findAll());
        List<Employee> emp= employeeRepository.findAll();
        return emp;
    }


    public Response addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto);
        employeeRepository.save(employee);
        System.out.println(employee.toString());

        return new Response("New Emplyee Added Successfully..",100,employee);
    }

    public Response getById(int id) {
        return new Response("Get Employee By USing Id",100,employeeRepository.findById(id));
    }

    public Response updateEmployee(int id, EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto);
        employeeRepository.save(employee);
        return new Response("Employee info udpdate succefully",100,employee);
    }

    public Response deleteEmployee(int id) {
        return new Response("Employee info delete",100, employeeRepository.deleteById(id));
    }

}
