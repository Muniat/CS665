package decorator.part1;

//the main class
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-- Testing Deposit Transaction by itself --");
		Transaction depositTransaction = new DepositTransaction();
		System.out.println(depositTransaction.getDescription() + "\n");
		
		System.out.println("-- Testing Deposit Transaction with Logging --");
		Transaction depositTransactionWithLogging = new Logging(new DepositTransaction());
		System.out.println(depositTransactionWithLogging.getDescription() + "\n");
		
		System.out.println("-- Testing Deposit Transaction with Security --");
		Transaction depositTransactionWithSecurity = new Security(new DepositTransaction());
		System.out.println(depositTransactionWithSecurity.getDescription() + "\n");
		
		System.out.println("-- Testing Deposit Transaction with Logging and Security --");
		Transaction depositTransactionWithLoggingAndSecurity = new Logging(new Security(new DepositTransaction()));
		System.out.println(depositTransactionWithLoggingAndSecurity.getDescription() + "\n");
		
		System.out.println("-- Testing Withdraw Transaction by itself --");
		Transaction withdrawTransaction = new WithdrawTransaction();
		System.out.println(withdrawTransaction.getDescription() + "\n");
		
		System.out.println("-- Testing Withdraw Transaction with Security and Logging --");
		Transaction withdrawTransactionWithLoggingAndSecurity = new Security(new Logging(new WithdrawTransaction()));
		System.out.println(withdrawTransactionWithLoggingAndSecurity.getDescription() + "\n");
	}

}
