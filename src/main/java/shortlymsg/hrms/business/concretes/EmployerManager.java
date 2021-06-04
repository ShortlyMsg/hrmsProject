package shortlymsg.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shortlymsg.hrms.business.abstracts.EmployerService;
import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.core.utilities.results.SuccessDataResult;
import shortlymsg.hrms.core.utilities.results.SuccessResult;
import shortlymsg.hrms.dataAccess.abstracts.EmployerDao;
import shortlymsg.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),"Data listed");
	}


	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer(İşveren) added");
	}
	
	
	
}
