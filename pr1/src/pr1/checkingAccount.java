package pr1;

public class checkingAccount extends Account{
	
		checkingAccount(double b){
			super (b);
		}
		private double credit_limit;
		private double interest;
		private double loan_interest;
		private double balance;
		
		@Override 
		public void debit(double m){
				balance -= m;
				if(balance<0){
					System.out.print("Debit amount exceeded amount balance");
					balance+=m;			
				}
	}
		
		public void nextMonth(){
			
		}
}
