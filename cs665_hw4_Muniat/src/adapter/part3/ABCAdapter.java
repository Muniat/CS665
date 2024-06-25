package adapter.part3;

public class ABCAdapter implements IVerify{

	public boolean verifyCustomer(Customer customer) {
		
        // Adapting the ABCValidator static method to the IVerify interface
        return ABCValidator.validate(customer.getName(), customer.getPhoneNumber());
    }	
}
