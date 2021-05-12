package coffeeShop.business.concretes;

import coffeeShop.business.abstracts.CustomerService;
import coffeeShop.entities.concretes.Customer;

public abstract class CustomerManager implements CustomerService {
	@Override
	public void add(Customer customer) {
		System.out.println("Veritabanýna kaydedildi. " + customer.getFirstName());
	}
	

}
