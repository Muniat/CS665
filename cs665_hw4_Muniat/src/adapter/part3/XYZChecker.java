package adapter.part3;

public class XYZChecker {

	public static boolean backgroundCheck(String name, String address) {
		
        //XYZ third-party background check, will always return true in this case
        System.out.println("XYZ third-party background verification for " + name + ", " + address);
        return true; 
    }
}
