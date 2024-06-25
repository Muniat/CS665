package factory.part3;

import simplefactory.part3.Customer;
import simplefactory.part3.StandardCustomer;

//class to create Standard Customers
public class StandardCustomerFactory extends CustomerFactory{

	public Customer createCustomer() {
		
		return new StandardCustomer();
	}
}
