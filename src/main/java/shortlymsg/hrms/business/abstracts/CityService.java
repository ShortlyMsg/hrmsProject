package shortlymsg.hrms.business.abstracts;

import java.util.List;

import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.entities.concretes.City;

public interface CityService {
	
	DataResult<List<City>> getAll();
	Result add(City city);
}
