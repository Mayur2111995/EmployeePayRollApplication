package com.example.employee_payroll_deployment.Controller;

import com.example.employee_payroll_deployment.Dto.EmployeeDto;
import com.example.employee_payroll_deployment.Dto.Response;
import com.example.employee_payroll_deployment.Model.Employee;
import com.example.employee_payroll_deployment.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/findAllEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();      // (List<Employee>)

    }

    @GetMapping("/findEmployee/{id}")
    public ResponseEntity<Response> getById(@PathVariable int id) {
        Response response = employeeService.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("/createEmployee")
    public ResponseEntity<Response> addEmployee(@Valid @RequestBody EmployeeDto employeeDto){
        Response response = employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }



    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<Response> updateEmployee(@Valid @RequestBody EmployeeDto employeeDto, @PathVariable int id) {
        Response response = employeeService.updateEmployee(id, employeeDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<Response> deleteEmployee(@PathVariable int id) {
        Response response = employeeService.deleteEmployee(id);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

//    @GetMapping("/SearchEmployee/{department}")
//    public ResponseEntity<Response> getByDepartment(@PathVariable String department) {
//        Response response = (Response) employeeService.getByDepartment(department);
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
}

