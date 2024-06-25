package part2;

//the UI Product
import java.util.ArrayList;
import java.util.List;

public class UIProduct {

	private List<String> steps;
	
	public UIProduct() {
		
		steps = new ArrayList<>();
	}
	
	public void add(String description) {
		
		steps.add(description);
	}
	
	public void showUIProduct() {
		
		System.out.println("User interface completed as below: ");
		for(int i=0; i<steps.size(); i++) {
			System.out.printf(" Step %d: %s\n", i+1, steps.get(i));
		}
	}
}
