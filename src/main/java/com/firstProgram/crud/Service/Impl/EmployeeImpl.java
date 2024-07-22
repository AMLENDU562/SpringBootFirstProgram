package com.firstProgram.crud.Service.Impl;

import com.firstProgram.crud.Dto.EmployeeDto;
import com.firstProgram.crud.Entity.Employee;
import com.firstProgram.crud.Mapper.EmployeeMapper;
import com.firstProgram.crud.Respository.EmployeeRespository;
import com.firstProgram.crud.Service.EmployeeService;

public class EmployeeImpl implements EmployeeService {
    EmployeeRespository employeeRespository;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        EmployeeMapper employeeMapper=new EmployeeMapper();
        Employee employee=employeeMapper.mapperToEmployee(employeeDto);
        employeeRespository.save(employee);
        EmployeeDto employeeDto1=employeeMapper.mapperToEmployeeDto(employee);
        return employeeDto1;
    }
}
