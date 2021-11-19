package com.software.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.software.model.Employee;
import com.software.service.EmployeeService;


@RestController
public class EmployeeController 
{
	
@Autowired
EmployeeService employeeService;


@GetMapping("/employee")
private List<Employee> getAllEmployee() 
{
 return employeeService.getAllEmployee();
}

@GetMapping("/employee/{empid}")
private Employee getEmployee(@PathVariable("empid") int empid) 
{
    return employeeService.getEmployeeById(empid);
}


@DeleteMapping("/employee/{empid}")
private void deleteBook(@PathVariable("empid") int empid) 
{
	employeeService.delete(empid);
}


@PostMapping("/employee")
private int saveBook(@RequestBody Employee employee) 
{
	employeeService.saveOrUpdate(employee);
    return employee.getemployee_id();
}


@PutMapping("/employee")
private Employee update(@RequestBody Employee employee) 
{
	employeeService.saveOrUpdate(employee);
return employee;
}
}
