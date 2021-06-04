package shortlymsg.hrms.business.concretes;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;
import shortlymsg.hrms.business.abstracts.AuthService;
import shortlymsg.hrms.business.abstracts.CandidateService;
import shortlymsg.hrms.business.abstracts.EmployerService;
import shortlymsg.hrms.core.utilities.results.ErrorResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.core.utilities.results.SuccessResult;
import shortlymsg.hrms.core.validations.VerificationService;
import shortlymsg.hrms.entities.concretes.Candidate;
import shortlymsg.hrms.entities.concretes.Employer;

@Service
public class AuthManager implements AuthService {
	
	private EmployerService employerService;
	private CandidateService candidateService;
	private VerificationService verificationService;
	
	@Autowired
	public AuthManager(EmployerService employerService, CandidateService candidateService,
			VerificationService verificationService) {
		super();
		this.employerService = employerService;
		this.candidateService = candidateService;
		this.verificationService = verificationService;
	}
	
	public static boolean isEmailValidation(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	@Override
	public Result registerEmployer(Employer employer, String confirmPassword) {
		if(!isEmailValidation(employer.getEmail()))
		{
			return new ErrorResult("Invalid email address. Please enter your email address correctly.");
		}
		
		if(!employer.getPassword().equals(confirmPassword)) 
		{
			return new ErrorResult("Password does not match. Please re-enter your password.");
		}
		var result = this.employerService.add(employer);
		
		if(result.isSuccess()) 
		{
				if(this.verificationService.sendVerificationCode(employer.getEmail())) {
					return new SuccessResult("Employer registered.");
				}
		}
		return new ErrorResult();
	}
	
	@Override
	public Result registerCandidate(Candidate candidate, String confirmPassword) {
		if(!isEmailValidation(candidate.getEmail())) 
		{
			return new ErrorResult("Invalid email address. Please enter your email address correctly.");
		
		}
		if(candidate.getPassword().equals( confirmPassword)) {
			return new ErrorResult("Password does not match. Please re-enter your password.");
		}
        var result = this.candidateService.add(candidate);
		
		if(result.isSuccess()) {
			if(this.verificationService.sendVerificationCode(candidate.getEmail())) {
				return new SuccessResult("Employer registered.");
			}
		}
		return new ErrorResult();
	}
}
