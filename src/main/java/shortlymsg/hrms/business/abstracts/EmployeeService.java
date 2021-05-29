package shortlymsg.hrms.business.abstracts;

import java.util.List;

import shortlymsg.hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}
