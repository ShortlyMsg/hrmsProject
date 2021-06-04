package shortlymsg.hrms.business.abstracts;

import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.entities.concretes.Candidate;
import shortlymsg.hrms.entities.concretes.Employer;

public interface AuthService {
	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerCandidate(Candidate candidate,String confirmPassword);
}
