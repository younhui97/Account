package pr1;

import java.util.InputMismatchException;

public class SavingAccount extends Account{
	private int month;
	private double loan;
	private int numonth;
	SavingAccount(double m,double loan) {
		super(m);
		this.loan=loan;
	}

	
	@Override
	public double getWithdrawableAccount() {
		return balance+credit_limit;
	}

	@Override
	public void passTime(int month){
		this.setMonth(month);
		numonth+=month;
		if(numonth==12){
		balance = balance*(Math.pow(1+loan,numonth));
		}
		
	}
	
	@Override
	public void debit(double m) throws Exception{
		if(m<0){
			throw new Exception("음수입력!");
		}
		else if (numonth < 12){
			throw new Exception("아직 출금할 수 없습니다");
		} else {
			balance-=m;
			if(balance<0){
				throw new Exception("Debit amount exceeded account balance");
				//balance+=m;
			}
		}
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}

}
