package shortlymsg.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shortlymsg.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

}
