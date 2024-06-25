package composite.part2;

import java.util.ArrayList;
import java.util.List;

//composite class
public class ComboStatement implements Statement{

	private List<Statement> statements = new ArrayList<>();
    private String label;
    
    public ComboStatement(String label) {
        this.label = label;
    }
    
    public void addStatement(Statement statement) {
        statements.add(statement);
    }
    
    @Override
    public void printStatement() {
        System.out.println("** Combo Statement of " + label);
        for (Statement statement : statements) {
            statement.printStatement();
        }
    }
}
