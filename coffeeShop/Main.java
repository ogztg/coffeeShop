package coffeeShop;

import java.time.LocalDate;

import coffeeShop.adapter.MernisServiceAdapter;
import coffeeShop.business.concretes.CustomerManager;
import coffeeShop.business.concretes.StarbucksCustomerManager;
import coffeeShop.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.add(new Customer(1, "Oðuz", "Tuð", LocalDate.of(1991,9,11), "15683065598"));

	}

}
