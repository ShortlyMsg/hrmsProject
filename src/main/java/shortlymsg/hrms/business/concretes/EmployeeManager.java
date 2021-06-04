package shortlymsg.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shortlymsg.hrms.business.abstracts.EmployeeService;
import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.core.utilities.results.SuccessDataResult;
import shortlymsg.hrms.core.utilities.results.SuccessResult;
import shortlymsg.hrms.dataAccess.abstracts.EmployeeDao;
import shortlymsg.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.findAll(),"Data listed");
	}


	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Employee (Çalışan) added");
	}

}
