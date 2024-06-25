package factory.part3;

import simplefactory.part3.Customer;
import simplefactory.part3.BusinessCustomer;

//class to create Business Customers
public class BusinessCustomerFactory extends CustomerFactory{

public Customer createCustomer() {
		
		return new BusinessCustomer();
	}
}
