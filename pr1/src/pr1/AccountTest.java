package pr1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest{
	
		public static void main(String[] args){
			
			Account account1=new checkingAccount(100,50,0.01,0.07);
			Account account2=new SavingAccount(100,0.05);
			 
			//CheckingAccount
			Scanner scan= new Scanner(System.in);
			double amount;
			try{
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter deposit amount for Account1: ");
				amount=scan.nextDouble();
				account1.debit(amount);
				System.out.println("Account1 balance:$"+account1.getBalance());
				
				System.out.println("Enter deposit amount for Account2:");
				amount=scan.nextDouble();
				account2.debit(amount);
				System.out.println("Account1 balance: $"+account1.getBalance());
		        }catch(InputMismatchException e){
				System.out.println("���ܹ߻�:���ڸ� �Է��ϼ���\n"+e.toString());
				}catch(Exception e){
				System.out.println("���ܹ߻�"+e.toString());
				}finally{
				account1.passTime(2);
				System.out.println("2 month later account1:"+account1.getBalance());
				}
		}
}

	