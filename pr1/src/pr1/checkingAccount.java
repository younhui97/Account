package pr1;

public class checkingAccount extends Account{
		private double interest;
		private double loan_interest;	
		private double loan;


		
		public checkingAccount(double m,double credit_limit,double interest,double loan_interest){
			super(m);
			this.credit_limit=credit_limit; 
			this.interest=interest;
			this.loan_interest=loan_interest;
		}
		//private double balance;
		
		@Override
		public void debit(double m){
				balance -= m;
				if(balance<0){
					System.out.print("Debit amount exceeded amount balance\n"); //�ܾ��� ������ ������ ����
					System.out.printf("",getBalance());
					loan=-1*balance;
					if (loan> credit_limit){ 
						System.out.print("loan exceeded credit_limit\n");
						//balance+=m;
					}
				}
		}
		
		/*public void nextMonth(){
			double nextmonth=0;
			loan_interest=0.1;
			interest=0.1;
			if (balance<0){
				nextmonth=(balance+(balance*loan_interest));
				System.out.print(nextmonth);
			}
			else if (balance>0){
				nextmonth=(balance+(balance*interest));
				System.out.print(nextmonth);
			}
		}*/
		@Override
		public double getWithdrawableAccount(){
			if ((balance+credit_limit)<0){
				double zero=0;
				return zero;
				}
			else{
				return balance+credit_limit;
			}
		}
		@Override
		public void passTime(int month){
			//double nextbalance;
			if (balance<0){
				//balance = balance*(Math.pow(1+loan_interest,month));
				balance=(balance+(balance*loan_interest*month));
				System.out.print(month);
				System.out.printf("month(s) later: %.2f",balance);
				System.out.print("\n");
			}
			else if (balance>0){
				//balance = balance*(Math.pow(1+interest,month));
				balance=(balance+(balance*loan_interest*month));
				System.out.print(month);
				System.out.printf("month(s) later: %.2f",balance);
				System.out.print("\n");
			}
		}
		
		public void isBankrupted(){
			boolean a1=((-1*balance)>credit_limit);
			if (a1){
				System.out.printf("Bankrupted!!\n");
			}
			else{
				System.out.print("Not Bankrupted.\n");
			}
			//return a1;
		}
}
