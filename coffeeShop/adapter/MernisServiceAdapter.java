package coffeeShop.adapter;

import coffeeShop.business.abstracts.CustomerCheckService;
import coffeeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			
		}
		catch(Exception e) {
			System.out.println("Kisi Dogrulanamdi.");
		}
		return result;
	
	}

}
