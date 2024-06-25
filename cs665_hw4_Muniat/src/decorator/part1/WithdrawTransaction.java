package decorator.part1;

//withdraw transactions
public class WithdrawTransaction implements Transaction{

	public String getDescription(){
		return "Transaction :: Withdraw Transaction";
	}
}
	
