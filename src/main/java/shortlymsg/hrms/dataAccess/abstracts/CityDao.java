package shortlymsg.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shortlymsg.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
