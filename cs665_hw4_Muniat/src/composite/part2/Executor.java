package composite.part2;

//the main class
public class Executor {

	public static void main(String[] args) {
		
		// Testing Monthly Statement by itself
		System.out.println("-- Testing Monthly Statement by itself --");
        MonthlyStatement janStatement = new MonthlyStatement("January", 2022);
        janStatement.printStatement();
        
        // Testing Quarterly Statement q1
        System.out.println("\n-- Testing Quarterly Statement --");
        ComboStatement q1Statement = new ComboStatement("Quarterly Statement for Q1 2022");
        q1Statement.addStatement(new MonthlyStatement("January", 2022));
        q1Statement.addStatement(new MonthlyStatement("February", 2022));
        q1Statement.addStatement(new MonthlyStatement("March", 2022));
        q1Statement.printStatement();
        
        // Testing Quarterly Statement q2
        System.out.println("\n-- Testing Quarterly Statement --");
        ComboStatement q2Statement = new ComboStatement("Quarterly Statement for Q2 2022");
        q2Statement.addStatement(new MonthlyStatement("April", 2022));
        q2Statement.addStatement(new MonthlyStatement("May", 2022));
        q2Statement.addStatement(new MonthlyStatement("June", 2022));
        q2Statement.printStatement();
        
        // Testing Half yearly Statement
        System.out.println("\n-- Testing Half Yearly Statement --");
        ComboStatement firstHalfYearlyStatement = new ComboStatement("First Half yearly Statement for 2022");
        firstHalfYearlyStatement.addStatement(q1Statement);
        firstHalfYearlyStatement.addStatement(q2Statement);
        firstHalfYearlyStatement.printStatement();
		
	}

}
