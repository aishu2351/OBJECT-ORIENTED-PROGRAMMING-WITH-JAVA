package p1a;

import java.util.Scanner;


public class fiboWithRecursion {
	    public static void main(String args[]) 
	    {
	        System.out.println("Enter number upto which Fibonacci series to print: ");
	        Scanner sc = new Scanner(System.in);
	        int num=sc.nextInt();
	      
	        System.out.println("Fibonacci series upto " + num +" numbers : ");
	        
	        for(int i=1; i<=num; i++)
	        {
	            System.out.print(fibonacci(i) +" ");
	        }
	  
	    
	    }

		static int fibonacci(int n)
		{
		    if(n == 1 || n == 2)
		    
		        return 1;
		    
		  
		    return (fibonacci(n-1) + fibonacci(n -2)); 
		}
}


