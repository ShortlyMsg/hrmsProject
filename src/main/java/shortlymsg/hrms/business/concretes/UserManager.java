package shortlymsg.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shortlymsg.hrms.business.abstracts.UserService;
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
	public List<User> getAll() {

		return this.userDao.findAll();
	}

}
