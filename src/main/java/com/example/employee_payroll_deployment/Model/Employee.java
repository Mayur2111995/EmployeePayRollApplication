package com.example.employee_payroll_deployment.Model;

import com.example.employee_payroll_deployment.Response.EmployeeDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id   //Primary Key
   @GeneratedValue (strategy = GenerationType.AUTO)
    private int employeeId;
    private String employeeName;
    private long salary;
    private String gender;
    private String department;

    public Employee(EmployeeDto employeeDto) {
        this.employeeName=employeeDto.getEmployeeName();
        this.salary=employeeDto.getSalary();
        this.gender=employeeDto.getGender();
        this.department=employeeDto.getDepartment();
    }
}
