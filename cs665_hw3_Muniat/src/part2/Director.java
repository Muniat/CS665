package part2;

//the director class to create UI
public class Director {

	Builder builder;
	
	public void create(Builder builder) {
		
		this.builder = builder;
		builder.createHeader();
		builder.createSidebar();
		builder.createMainPanel();
		builder.createFooter();
	}
}
