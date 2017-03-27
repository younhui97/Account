package pr1;

import java.util.Scanner;

public class AccountTest{
		
		private static Scanner sc;

		
		public static void main(String[] args){
			
			Account account1=new checkingAccount(100,50,0.01,0.07);
			Account account2=new SavingAccount(100);
			
			System.out.printf("account1 balance: $ %f \n",account1.getBalance());
			System.out.printf("account2 balance: $ %f \n",account2.getBalance());
			
			sc = new Scanner(System.in);
			
			System.out.print("Enter deposit money from account1\n");
			double wm1= sc.nextDouble();
			account1.credit(wm1);
			
			System.out.printf("account1 balance: $ %f \n",account1.getBalance());
			System.out.printf("account2 balance: $ %f \n",account2.getBalance());
			
			System.out.print("Enter withdrawal money from account2\n");
			double wm2= sc.nextDouble();
			account2.debit(wm2);
			
		
			System.out.printf("account1 balance: $ %f \n",account1.getBalance());
			System.out.printf("account2 balance: $ %f \n",account2.getBalance());
			
			
			System.out.printf("Next month's account1 balance:  ");
			((checkingAccount) account1).nextMonth();
			System.out.printf("\n");
			System.out.printf("Next month's account2 balance:  ");
			((checkingAccount) account2).nextMonth();
			
		}
}