package in.co.vwits.emp.service;

import java.util.List;
import java.util.Optional;

import in.co.vwits.emp.model.exception.EmployeeNotFoundException;
import in.co.vwits.emp.model.Employee;

public interface EmployeeService {
	
	public void create(Employee emp);
	public void delete(int id);
	public Optional<Employee> findById(int id) throws EmployeeNotFoundException;
	public List<Employee> findAllEmployees();
	public void updateEmployeeName(Employee updatedEmp);
	public void updateEmployeeSalary(Employee updatedEmp);
	public List<Employee> sortEmployeesByNameInAsc();
	public List<Employee> sortEmployeesByNameInDesc();
	public List<Employee> sortEmployeeBySalaryInByAsc();
	public List<Employee> sortEmployeesBySalaryInDesc();
	
}