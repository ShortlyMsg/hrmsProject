package shortlymsg.hrms.core.validations;

public interface VerificationService {
	
	boolean sendVerificationCode(String emailAddress);
}
