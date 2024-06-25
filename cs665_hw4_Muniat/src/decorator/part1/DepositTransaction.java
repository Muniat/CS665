package decorator.part1;

//deposit transaction
public class DepositTransaction implements Transaction{

	public String getDescription() {
		return "Transaction :: Deposit Transaction";
	}
}
