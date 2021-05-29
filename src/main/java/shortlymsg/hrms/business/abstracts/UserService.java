package shortlymsg.hrms.business.abstracts;

import java.util.List;

import shortlymsg.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
