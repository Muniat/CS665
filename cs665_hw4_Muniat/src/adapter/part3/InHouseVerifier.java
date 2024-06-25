package adapter.part3;

public class InHouseVerifier implements IVerify{

	 public boolean verifyCustomer(Customer customer) {
		 
	        // in-house customer verification, will always return true in this case
	        System.out.println("Doing in house verification for " + customer.getName());
	        return true; 
	    }
}
