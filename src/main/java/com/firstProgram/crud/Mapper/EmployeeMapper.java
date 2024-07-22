package com.firstProgram.crud.Mapper;
import com.firstProgram.crud.Dto.EmployeeDto;
import com.firstProgram.crud.Entity.Employee;

public class EmployeeMapper {

    public EmployeeDto mapperToEmployeeDto(Employee employee)
    {
    return new EmployeeDto(
    employee.getId(),
    employee.getFirstName(),
    employee.getLastName(),
    employee.getEmailId()
    );
    }
    public Employee mapperToEmployee(EmployeeDto employeeDto)
    {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmailId()
        );
    }
}
