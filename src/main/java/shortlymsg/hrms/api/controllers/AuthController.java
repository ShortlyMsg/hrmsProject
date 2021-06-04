package shortlymsg.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shortlymsg.hrms.business.abstracts.AuthService;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.entities.concretes.Candidate;
import shortlymsg.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/auths")
public class AuthController { 
	private AuthService authService;
	
	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody Employer employer, String confirmPassword) {
		return this.authService.registerEmployer(employer, confirmPassword);
	}
	@PostMapping("/registerCandidate")
	public Result registerCandidate(@RequestBody Candidate candidate, String confirmPassword) {
		return this.authService.registerCandidate(candidate, confirmPassword);
	}
	
}
