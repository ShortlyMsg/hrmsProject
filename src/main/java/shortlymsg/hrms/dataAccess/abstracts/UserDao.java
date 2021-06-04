package shortlymsg.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import shortlymsg.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
}
