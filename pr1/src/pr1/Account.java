package pr1;

public class Account{
	private double money;
	
	public Account(double m){
		money = m;
	}
	public double getMoney(){
		return money;
	}
	public void setMoney(double m){
		money = m;
	}
	public void add(double m){
		money += m;
	}
	public void withdraw(double m){
		money -= m;
	}
}
