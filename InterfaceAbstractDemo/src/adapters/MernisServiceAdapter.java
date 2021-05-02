package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService
{

	@SuppressWarnings("deprecation")
	@Override
	public boolean checkIfRealPerson(Customer customer) 
	{
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		 try 
		 {
			  result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
		  } 
		 
		 catch (NumberFormatException e) 
		 {
			   e.printStackTrace();
		 } 
		 
		 catch (RemoteException e) 
		 {
		       e.printStackTrace();
		 }
		 
		 return result;
		
	}
	
}