package pr1;

import java.util.Scanner;

public class AccountExample{
		
		private static Scanner sc;

		public static void main(String[] args){
			
			Account account1=new Account(50);
			Account account2=new Account(0);
			
			System.out.printf("account1 balance: $ %f \n",account1.getMoney());
			System.out.printf("account2 balance: $ %f \n",account2.getMoney());
			
			sc = new Scanner(System.in);
			
			System.out.print("Enter withdrawing money from account1");
			double wm1= sc.nextDouble();
			account1.withdraw(wm1);
			if (account1.getMoney()<0){
				System.out.print("Debit amount exceeded amount balance");
				account1.setMoney(50);
			}
			System.out.printf("account1 balance: $ %f \n",account1.getMoney());
			System.out.printf("account2 balance: $ %f \n",account2.getMoney());
			
			System.out.print("Enter withdrawing money from account2");
			double wm2= sc.nextDouble();
			account2.withdraw(wm2);
			
			if (account2.getMoney()<0){
				System.out.print("Debit amount exceeded amount balance");
				account2.setMoney(0);
			}
			System.out.printf("account1 balance: $ %f \n",account1.getMoney());
			System.out.printf("account2 balance: $ %f \n",account2.getMoney());
		}
}