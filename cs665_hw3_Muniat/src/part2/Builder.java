package part2;

//base class
public interface Builder {

	public void createHeader();
	public void createSidebar();
	public void createMainPanel();
	public void createFooter();
	
	UIProduct getUI();
}
