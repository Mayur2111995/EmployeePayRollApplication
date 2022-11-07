package com.example.employee_payroll_deployment.Model;

import com.example.employee_payroll_deployment.Dto.EmployeeDto;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

   @Id   //Primary Key
   @GeneratedValue (strategy = GenerationType.AUTO)
    public int id;
    public String employeeName;
    public long salary;
    public String notes;
    public String gender;
    @ElementCollection
   // @CollectionTable(name = "department", joinColumns = @JoinColumn(name = "id"))
    public List<String> department;
    public String profilePic;

    public String startDate;


    public Employee(EmployeeDto employeeDto) {
        this.employeeName=employeeDto.getEmployeeName();
        this.salary=employeeDto.getSalary();
        this.gender=employeeDto.getGender();
        this.department=employeeDto.getDepartment();
      //this.department= Collections.singletonList(employeeDto.getDepartment().toString());
        this.startDate=employeeDto.getStartDate();
        this.profilePic=employeeDto.getProfilePic();
        this.notes=employeeDto.getNotes();
    }
}
