package p3;

import java.util.Scanner;

public class stack
{

	int top=-1; 
	int a[]=new int[10];
	int n,i;
	

	void push()
{

		System.out.println("enter the element to be inserted");

		Scanner br = new Scanner(System.in);

		n=br.nextInt();

		if(top>=9)
			
			System.out.println("stack overflow, cannot insert");

		else{

			top=top+1;
            a[top]=n;
         }

	}

	void pop()
{

			int c;

            
			if(top==-1)

				System.out.println("stack underflow, cannot remove");

			else
{
				c=a[top];
				top=top-1;
                System.out.println("Element removed is "+c);

			         }

	}
	
void display()
{

			if(top==-1)

			System.out.println("stack is empty");

			else

			for(i=0;i<=top;i++)

				System.out.println(a[i]);

		}


public static void main(String args[])
{

	p3 a=new p3();

	int l; 

	do
	{

		Scanner ob = new Scanner(System.in);

		System.out.println("Enter your option:\n1.push\n2.pop\n3.display \n4.exit");

		l=ob.nextInt();

		switch(l)

		{

			case 1: a.push();

				break;

			case 2: a.pop();

				break;

			case 3:a.display();

				break;

			case 4:break;

			default: System.out.println("wrong input");

				break;

		}
	}
	while(l!=4);

           }

}

