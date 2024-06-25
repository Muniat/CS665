package adapter.part3;

public class Executor {

	public static void main(String[] args) {
		
		Customer alice = new Customer("Alice", "222-333-4444", "123 Main St, Boston, MA");
        
        IVerify inHouseVerifier = new InHouseVerifier();
        inHouseVerifier.verifyCustomer(alice);
        
        IVerify abcAdapter = new ABCAdapter();
        abcAdapter.verifyCustomer(alice);
        
        IVerify xyzAdapter = new XYZAdapter();
        xyzAdapter.verifyCustomer(alice);
	}

}
