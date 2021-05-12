package coffeeShop.business.abstracts;

import coffeeShop.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);

}
