package simplefactory.part3;

//create different types of customer
public class CustomerFactory {

public static Customer createCustomer(String type) {
		
		switch(type) {
		
		case "StandardCustomer":
			return new StandardCustomer();
		case "PreferredCustomer":
			return new PreferredCustomer();
		case "BusinessCustomer":
			return new BusinessCustomer();
		default:
			throw new IllegalArgumentException("Wrong customer type");
			
		}
	}
}