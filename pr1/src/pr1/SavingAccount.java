package pr1;

public class SavingAccount extends Account{
	private int month;
	private double loan;
	
	SavingAccount(double m,double loan) {
		super(m);
		this.loan=loan;
	}

	
	@Override
	public double getWithdrawableAccount() {
		return balance+credit_limit;
	}

	@Override
	public void passTime(int month) 
	{	this.month=month;
		balance = balance*(Math.pow(1+loan,month));
		
		
	}
	
	@Override
	public void debit(double m){
		if (month < 12){
			System.out.print("Withdrawl denied.Can withdraw after at least one year");
		} else {
			balance-=m;
			if(balance<0){
				System.out.print("Debit amount exceeded amount balance\n");
				balance+=m;
			}
		}
	}

}
