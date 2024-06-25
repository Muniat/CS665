package composite.part2;

//leaf class
public class MonthlyStatement implements Statement{

	private String month;
	private int year;
	
	public MonthlyStatement(String month, int year) {
		this.month = month;
		this.year = year;
	}
	
	public void printStatement() {
		System.out.println("** Monthly Statement for " + month + ", " + year);
	}
}
