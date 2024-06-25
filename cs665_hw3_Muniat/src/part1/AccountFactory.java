package part1;

//create family of account, i.e, checking account and savings account
public interface AccountFactory {

	public abstract CheckingAccount createCheckingAccount();
	public abstract SavingsAccount createSavingsAccount();
}
