package decorator.part1;

//the decorator class
public abstract class TransactionDecorator implements Transaction{

	protected Transaction decoratedTransaction;
	
	public TransactionDecorator(Transaction decoratedTransaction) {
		this.decoratedTransaction = decoratedTransaction;
	}
	
	public String getDescription() {
		return decoratedTransaction.getDescription();
	}
}
