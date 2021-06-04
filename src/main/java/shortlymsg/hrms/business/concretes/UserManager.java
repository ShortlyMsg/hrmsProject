package shortlymsg.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shortlymsg.hrms.business.abstracts.UserService;
import shortlymsg.hrms.core.utilities.results.DataResult;
import shortlymsg.hrms.core.utilities.results.Result;
import shortlymsg.hrms.core.utilities.results.SuccessDataResult;
import shortlymsg.hrms.core.utilities.results.SuccessResult;
import shortlymsg.hrms.dataAccess.abstracts.UserDao;
import shortlymsg.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public DataResult<List<User>> getAll() {

		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"Data listelendi");
			
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

}
