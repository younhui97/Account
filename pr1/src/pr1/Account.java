package pr1;

public class Account{
	private double balance;
	
	Account(double m){
		balance = m;
	}
	public double getBalance(){
		return balance;
	}
	protected void setBalance(double m){
		balance = m;
	}
	public void credit(double m){
		balance += m;
	}
	public void debit(double m){
		balance -= m;
		if(balance<0){
			System.out.print("Debit amount exceeded amount balance");
			balance+=m;
		}
	}
}
