package pr1;

import java.util.Scanner;

public class AccountExample{
		
		private static Scanner sc;

		public static void main(String[] args){
			
			Account account1=new Account(100);
			Account account2=new Account(100);
			
			System.out.printf("account1 balance: $ %f \n",account1.getBalance());
			System.out.printf("account2 balance: $ %f \n",account2.getBalance());
			
			sc = new Scanner(System.in);
			
			//System.out.print("Enter deposit money from account1");
			//double wm1= sc.nextDouble();
			//if (account1.debit)

			System.out.print("Enter withdrawing money from account1");
			double wm1= sc.nextDouble();
			account1.debit(wm1);
			if (account1.getBalance()<0){
				System.out.print("Debit amount exceeded amount balance");
				account1.setBalance(50);
			}
			System.out.printf("account1 balance: $ %f \n",account1.getBalance());
			System.out.printf("account2 balance: $ %f \n",account2.getBalance());
			
			System.out.print("Enter withdrawing money from account2");
			double wm2= sc.nextDouble();
			account2.debit(wm2);
			
			if (account2.getBalance()<0){
				System.out.print("Debit amount exceeded amount balance");
				account2.setBalance(0);
			}
		
			System.out.printf("account1 balance: $ %f \n",account1.getBalance());
			System.out.printf("account2 balance: $ %f \n",account2.getBalance());
		}
}