package shortlymsg.hrms.business.abstracts;

import java.util.List;

import shortlymsg.hrms.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate> getAll();
}
