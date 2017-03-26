package pr1;

public class checkingAccount extends Account{
	
		checkingAccount(double m){
			super(m);
		}
		private double credit_limit;
		private double interest;
		private double loan_interest;
		//private double balance;
		private double inibalance;
		private double loan;
		
		@Override
		public double getBalance(){
			return balance;
		}
		@Override
		public void debit(double m){
				balance -= m;
				if(balance<0){
					System.out.print("Debit amount exceeded amount balance\n");
					System.out.printf("",getBalance());
					loan=-1*balance;
					credit_limit = 10.0;
					if (loan> credit_limit){ 
						System.out.print("loan exceeded credit_limit\n");
						balance+=m;
					}
				}
		}
		
		public void nextMonth(){
			System.out.print("NEXT MONTH!");
			if (balance<0){
				
				
			}
			
		}
		
}
