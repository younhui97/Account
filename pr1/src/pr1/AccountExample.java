package pr1;

import java.util.Scanner;

public class AccountExample{
		
		private static Scanner sc;

		public static void main(String[] args){
			
			checkingAccount account1=new checkingAccount(100);
			checkingAccount account2=new checkingAccount(100);
			
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
			
			//nextMonth();
		}
}