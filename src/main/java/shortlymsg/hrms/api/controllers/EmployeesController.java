package shortlymsg.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shortlymsg.hrms.business.abstracts.EmployeeService;
import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeeService;

	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.add(employee);
	}
}
