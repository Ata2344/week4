package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Veri Tabanýna kayýt edildi :  "+customer.getFirstName() + " " + customer.getLastName());
	}

}
