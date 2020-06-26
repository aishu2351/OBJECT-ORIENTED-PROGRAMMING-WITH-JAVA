
package p2;

import java.util.Scanner;
public class account
{
	static int accno;
	static long phone_no;
	static float balance_amt=0;
	static String name;
	

	static void getinput(){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter name");
		name=ob.nextLine();
		System.out.println("Enter account number");
		accno=ob.nextInt();
		System.out.println("Enter phone number");
		phone_no=ob.nextLong();
	}
	
	static void Deposit()
	{
		Scanner ob=new Scanner(System.in);
		int dep;
		System.out.println("Enter the amount to be deposited");
		dep=ob.nextInt();
		balance_amt=balance_amt+dep;
	}
	
	static void Withdraw(){
	
			Scanner ob=new Scanner(System.in);
			int wit;
			System.out.println("Enter the amount to be withdrawed");
			wit=ob.nextInt();
				if(wit>balance_amt)
					System.out.println("Insufficient balance");
				else
					balance_amt=balance_amt-wit;
	}
	public static void main(String a[])
		{
			int n;
			//Scanner ob=new Scanner(System.in);
			getinput();
			do{
				System.out.println("Enter your option:\n1.deposit amount\n2.withdraw amount\n3.display balance amount\n4.exit");
				Scanner ob=new Scanner(System.in);
				n=ob.nextInt();
				switch(n)
				{
						case 1:Deposit();
							break;
				
						case 2:Withdraw();
							break;
				
						case 3:System.out.println("Balance amount = "+balance_amt);
							break;

						case 4:break;

						default:System.out.println("wrong entry");
								break;
				}
			}while(n!=5);
		}

      }


