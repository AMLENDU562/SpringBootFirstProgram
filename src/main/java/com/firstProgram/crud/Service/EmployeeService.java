package com.firstProgram.crud.Service;
import com.firstProgram.crud.Entity.Employee;
import com.firstProgram.crud.Dto.EmployeeDto;
import com.firstProgram.crud.Mapper.EmployeeMapper;
import com.firstProgram.crud.Respository.EmployeeRespository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

}
