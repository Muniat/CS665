package part2;

//main class
public class Testing {

	public static void main(String[] args) {
		
		Director director = new Director();
		Builder builder;
		UIProduct ui;
		
		System.out.println("--Testing Bank of America Version of UI --\n");
		builder = new BankOfAmericaUIBuilder();
		director.create(builder);
		ui = builder.getUI();
		ui.showUIProduct();
		
		System.out.println("\n--Testing Chase Version of UI --\n");
		builder = new ChaseUIBuilder();
		director.create(builder);
		ui = builder.getUI();
		ui.showUIProduct();
	}
}
