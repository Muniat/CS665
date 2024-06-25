package part1;

//create Chase accounts
public class ChaseAccountFactory implements AccountFactory{

	public CheckingAccount createCheckingAccount() {
		return new ChaseCheckingAccount();
	}
	
	public SavingsAccount createSavingsAccount() {
		return new ChaseSavingsAccount();
	}
}
