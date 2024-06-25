package part1;

//create basic accounts
public class BasicAccountFactory implements AccountFactory{

	public CheckingAccount createCheckingAccount() {
		return new CheckingAccount();
	}
	
	public SavingsAccount createSavingsAccount() {
		return new SavingsAccount();
	}
}
