package in.co.vwits.emp.dao;

import java.util.List;
import java.util.Optional;
import in.co.vwits.emp.model.Employee;

public interface EmployeeDao {
	public int create(Employee emp);
	public void delete(int id);
	public Optional<Employee> findById(int id);
	public List<Employee> findAll();
	public void updateName(Employee updatedEmp);
	public void updateSalary(Employee updatedEmp);
}