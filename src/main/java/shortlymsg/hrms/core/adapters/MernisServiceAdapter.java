package shortlymsg.hrms.core.adapters;

import shortlymsg.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckMernisService {

	@Override
	public boolean checkIfRealTcNo(Candidate candidate) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

        boolean serviceResult=false;

        try {

            serviceResult = kpsPublicSoapProxy.TCKimlikNoDogrula(
            		candidate.getIdentityNumber(),
                    candidate.getFirstName().toUpperCase(),
                    candidate.getLastName().toUpperCase(),
                    candidate.getBirthDate().getDate()
                    );

        } catch (Exception e) {

            System.out.println("Not a valid person");
        }

       return serviceResult; 
    }

}
