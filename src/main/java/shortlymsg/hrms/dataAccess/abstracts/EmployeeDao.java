package shortlymsg.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shortlymsg.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
