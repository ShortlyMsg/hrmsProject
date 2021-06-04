package shortlymsg.hrms.business.abstracts;

import java.util.List;

import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
