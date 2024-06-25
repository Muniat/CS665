package adapter.part3;

public class ABCValidator {

	public static boolean validate(String name, String phoneNumber) {
		
        // ABC third-party validation, will always return true in this case
        System.out.println("ABC third-party verification for " + name + ", " + phoneNumber);
        return true;
    }
}
