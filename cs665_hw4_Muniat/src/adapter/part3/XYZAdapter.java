package adapter.part3;

public class XYZAdapter implements IVerify{

	public boolean verifyCustomer(Customer customer) {
		
        // Adapting the XYZChecker static method to the IVerify interface
        return XYZChecker.backgroundCheck(customer.getName(), customer.getAddress());
    }
}
