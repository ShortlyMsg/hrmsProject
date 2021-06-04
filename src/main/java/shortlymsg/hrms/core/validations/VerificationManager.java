package shortlymsg.hrms.core.validations;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService {

	@Override
	public boolean sendVerificationCode(String emailAddress) {
		UUID uuid = UUID.randomUUID();
		String code= uuid.toString();
			System.out.println(emailAddress+"verification code has been sent to your e-mail. Verification Code : " + code);
			return true;
	}

	
}
