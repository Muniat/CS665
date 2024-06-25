package simplefactory.part3;

//main class
public class CustomerCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Part3 First version using Simple Factory");
		
		System.out.println("Creating Standard Customer");
		CustomerFactory.createCustomer("StandardCustomer").printStatus();
		
		System.out.println("Creating Preferred Customer");
		CustomerFactory.createCustomer("PreferredCustomer").printStatus();
		
		System.out.println("Creating Business Customer");
		CustomerFactory.createCustomer("BusinessCustomer").printStatus();
	}

}
