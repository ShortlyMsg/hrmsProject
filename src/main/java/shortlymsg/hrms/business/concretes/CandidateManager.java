package shortlymsg.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shortlymsg.hrms.business.abstracts.CandidateService;
import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.core.utilities.results.SuccessDataResult;
import shortlymsg.hrms.core.utilities.results.SuccessResult;
import shortlymsg.hrms.dataAccess.abstracts.CandidateDao;
import shortlymsg.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(),"Data Listelendi");
	}


	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Aday Eklendi");
	}
	
}
