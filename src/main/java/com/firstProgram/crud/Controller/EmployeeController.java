package com.firstProgram.crud.Controller;

import com.firstProgram.crud.Dto.EmployeeDto;
import com.firstProgram.crud.Entity.Employee;
import com.firstProgram.crud.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor

public class EmployeeController {
    @Autowired
    private  EmployeeService employeeService;

    @PostMapping("/post")
    ResponseEntity<EmployeeDto>postEmployee(@RequestBody EmployeeDto employeeDto)
    {
        EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

    }
}
