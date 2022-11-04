package com.example.employee_payroll_deployment.Dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor               //To generate the no-argument constructor for a class

@AllArgsConstructor              //generates a constructor with 1 parameter for each field in your class.
public class EmployeeDto {
    //to achieve regular expression validation.
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid: It should have at least 2 characters starting with Capital letter.")
    public String employeeName;
    public String profilePic;
    public String notes;


    @Min(value = 10000, message = "salary cannot be less than 10000.")    //ExceptionHandler

    @Max(value = 1000000, message = "Salary cannot be greater than 80000.")   //ExceptionHandler
    public long salary;

    @NotNull(message = "Please enter valid option gender.")
    public String gender;

   // @JsonFormat(pattern = "dd MM yyyy")
   // @NotNull(message = "StartDate Should Not be Empty")
   // @PastOrPresent(message = "startDate should be past or todays date")
    public String startDate;

    //@NotBlank(message = "Department is Required")
    public List<String> department;

}



