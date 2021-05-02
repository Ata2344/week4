import java.util.Date;
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.CustormerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
	
		
		Customer customer = new Customer();
		customer.setId(0);
		customer.setFirstName("Ahmet Turan");
		customer.setLastName("Aydın");
		customer.setDateOfBirth(new Date(1997,1,1));
		customer.setNationalityId("5456465654");	
		
		
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustormerCheckManager());
		neroCustomerManager.save(customer);
			
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer); 
	
	}

}