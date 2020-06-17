package p1a;

import java.util.Scanner;

public class fiboWithOutRecursion {
public static void main(String arg[]) {
	int t1=0,t2=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=sc.nextInt();
	System.out.println("FIBO NUMBERS FROM:0-"+n);
	for(int i=1;i<=n;i++) {
		System.out.println(t1+" ");
		int sum=t1+t2;
		t1=t2;
		t2=sum;
	}
	
}
}
