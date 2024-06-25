package part1;

//main class
public class AccountCreator {

	public static void main(String[] args) {
		
		System.out.println("-- Testing Basic Version of Accounts --");
		createAccounts(new BasicAccountFactory());
		System.out.println();
		
		System.out.println("-- Testing Bank of America Version of Accounts --");
		createAccounts(new BankOfAmericaFactory());
		System.out.println();
		
		System.out.println("-- Testing Chase Version of Accounts --");
		createAccounts(new ChaseAccountFactory());
		System.out.println();
	}
	
	
	public static void createAccounts(AccountFactory account) {
		
		System.out.println("Creating Checking Account");
		CheckingAccount checkingAccount = account.createCheckingAccount();
		System.out.println(checkingAccount.toString());
		
		System.out.println("Creating Savings Account");
		SavingsAccount savingsAccount = account.createSavingsAccount();
		System.out.println(savingsAccount.toString());
	}

}
