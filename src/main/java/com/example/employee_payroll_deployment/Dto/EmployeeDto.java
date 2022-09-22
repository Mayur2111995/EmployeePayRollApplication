package com.example.employee_payroll_deployment.Dto;


import lombok.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor               //To generate the no-argument constructor for a class

@AllArgsConstructor              //generates a constructor with 1 parameter for each field in your class.
public class EmployeeDto {
    private int id;

    //to achieve regular expression validation.
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid: It should have at least 2 characters starting with Capital letter.")
    private String employeeName;


    @Min(value = 10000, message = "salary cannot be less than 10000.")    //ExceptionHandler

    @Max(value = 500000, message = "Salary cannot be greater than 500000.")   //ExceptionHandler
    private long salary;

    @Pattern(regexp = "^[M/F]{1}$", message = "Please enter valid option gender.")
    private String gender;

    @NotBlank(message = "Department is Required")
    private String department;


}
