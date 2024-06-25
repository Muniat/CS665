package part1;

//create bank of america accounts
public class BankOfAmericaFactory implements AccountFactory{

	public CheckingAccount createCheckingAccount() {
		return new BankOfAmericaCheckingAccount();
	}
	
	public SavingsAccount createSavingsAccount() {
		return new BankOfAmericaSavingsAccount();
	}
}
