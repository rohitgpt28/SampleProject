package com.software.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity


@Table
public class Employee
{

	
@Id
@Column
private int employee_id;
@Column
private String employee_name;
@Column
private String department;
@Column
private int salary;
public int getemployee_id() 
{
return employee_id;
}
public void setBookid(int employee_id) 
{
this.employee_id = employee_id;
}
public String getemployee_name()
{
return employee_name;
}
public void setBookname(String employee_name) 
{
this.employee_name = employee_name;
}
public String getdepartment() 
{
return department;
}
public void setdepartment(String department) 
{
this.department = department;
}
public int getsalary() 
{
return salary;
}
public void setPrice(int salary) 
{
this.salary = salary;
}
}