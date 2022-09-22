package com.example.employee_payroll_deployment.Controller;

import com.example.employee_payroll_deployment.Model.Employee;
import com.example.employee_payroll_deployment.Response.EmployeeDto;
import com.example.employee_payroll_deployment.Response.Response;
import com.example.employee_payroll_deployment.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeService.getAllEmployees();

}
    @GetMapping("/Employee/{id}")
    public ResponseEntity<Response> getById(@PathVariable int id) {
        Response response = employeeService.getById(id);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Response> addEmployee(@Valid @RequestBody EmployeeDto employeeDto){
        Response response = employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<Response> updateEmployee(@Valid @RequestBody EmployeeDto employeeDto, @PathVariable int id) {
        Response response = employeeService.updateEmployee(id, employeeDto);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<Response> deleteEmployee(@PathVariable int id ) {
        Response response = employeeService.deleteEmployee(id);
        return new ResponseEntity<>(response,HttpStatus.OK);

    }
}

