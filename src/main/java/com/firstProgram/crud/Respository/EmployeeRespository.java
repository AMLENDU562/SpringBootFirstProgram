package com.firstProgram.crud.Respository;

import com.firstProgram.crud.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee,Long> {
}
