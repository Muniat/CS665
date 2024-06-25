package factory.part3;

import simplefactory.part3.Customer;

//main class
public class Test {

	public static void main(String[] args) {
		
		System.out.println("Part3 Second version using Factory Method");
		
		System.out.println("Creating Standard Customer");
		CustomerFactory standardCustomerFactory = new StandardCustomerFactory();
		Customer standardCustomer = standardCustomerFactory.createCustomer();
		status(standardCustomer);
		
		System.out.println("Creating Preferred Customer");
		CustomerFactory preferredCustomerFactory = new PreferredCustomerFactory();
		Customer preferredCustomer = preferredCustomerFactory.createCustomer();
		status(preferredCustomer);
		
		System.out.println("Creating Business Customer");
		CustomerFactory businessCustomerFactory = new BusinessCustomerFactory();
		Customer businessCustomer = businessCustomerFactory.createCustomer();
		status(businessCustomer);
	}
	
	private static void status(Customer customer) {
		customer.printStatus();
	}

}
