package pr1;

public class SavingAccount extends Account{

	SavingAccount(double m) {
		super(m);
	}

	@Override
	public double getWithdrawableAccount() {
		return balance+credit_limit;
	}

	@Override
	public int passTime(int time) {
		return time;
	}

}
