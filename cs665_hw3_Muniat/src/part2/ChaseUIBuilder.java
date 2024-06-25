package part2;

//builds Chase UI
public class ChaseUIBuilder implements Builder{

private UIProduct ui;
	
	public ChaseUIBuilder() {
		
		ui = new UIProduct();
		
	}
	
	public void createHeader() {
		
		ui.add("Creating Chase Header...");
	}
	
	public void createSidebar() {
		
		ui.add("Creating Chase Sidebar...");
	}
	
	public void createMainPanel() {
		
		ui.add("Creating Chase MainPanel...");
	}
	
	public void createFooter() {
		ui.add("Creating Chase Footer...");
	}

	@Override
	public UIProduct getUI() {
		
		return ui;
	}
}
