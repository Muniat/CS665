package part2;

//builds Bank of America UI
public class BankOfAmericaUIBuilder implements Builder{

	private UIProduct ui;
	
	public BankOfAmericaUIBuilder() {
		
		ui = new UIProduct();
		
	}
	
	public void createHeader() {
		
		ui.add("Creating Bank of America Header...");
	}
	
	public void createSidebar() {
		
		ui.add("Creating Bank of America Sidebar...");
	}
	
	public void createMainPanel() {
		
		ui.add("Creating Bank of America MainPanel...");
	}
	
	public void createFooter() {
		ui.add("Creating Bank of America Footer...");
	}

	public UIProduct getUI() {
		
		return ui;
	}
}
