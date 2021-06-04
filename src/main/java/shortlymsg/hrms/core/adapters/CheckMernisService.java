package shortlymsg.hrms.core.adapters;

import shortlymsg.hrms.entities.concretes.Candidate;

public interface CheckMernisService {
	boolean checkIfRealTcNo(Candidate candidate);
}
