package concrete;

import abstracts.CustomerCheckService;

import entities.Customer;

public class CustormerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;

	}

}
