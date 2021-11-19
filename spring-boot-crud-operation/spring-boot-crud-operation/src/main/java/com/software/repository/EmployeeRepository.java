package com.software.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.software.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
}
