package com.example.employee_payroll_deployment.Repository;


import com.example.employee_payroll_deployment.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee deleteById(int id);

    Employee findByDepartment(String department);

}

