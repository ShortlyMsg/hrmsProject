package shortlymsg.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shortlymsg.hrms.business.abstracts.JobPositionService;
import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.core.utilities.results.SuccessDataResult;
import shortlymsg.hrms.core.utilities.results.SuccessResult;
import shortlymsg.hrms.dataAccess.abstracts.JobPositionDao;
import shortlymsg.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}



	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),"Data listelendi");
	}



	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu eklendi");
	}

}
