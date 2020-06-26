package P5;
import java.util.Scanner;

public class matrixMultiply {
	    public static void main(String args[])
	    {
	        int r1,c1,r2,c2;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the first order of matrix");
	        System.out.print("Row:");
	        r1 = sc.nextInt();
	        System.out.print("Column:");
	        c1 = sc.nextInt();
	        System.out.println("Enter the second order of matrix");
	        System.out.print("Row:");
	        r2 = sc.nextInt();
	        System.out.print("Column:");
	        c2 = sc.nextInt();
	        int[][] x = new int[r1][c1];
	        int[][] y = new int[r2][c2];
	        int[][] z = new int[r2][c2];
	        
	        System.out.println("Enter the elements of 1st martix row wise \n");
	        for (int i = 0; i < r1; i++)
	        {
	            for (int j = 0; j < c1; j++)
	            {
	                x[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Enter the elements of 2nd martix row wise \n");
	        for (int i = 0; i < r2; i++)
	        {
	            for (int j = 0; j < c2; j++)
	            {
	                y[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Multiplying the matrices...");
	        
	        for (int i = 0; i < r1; i++)
	        {
	            for (int j = 0; j < c2; j++)
	            {
	                for (int k = 0; k < r2; k++)
	                {
	                    z[i][j] = z[i][j] + x[i][k] * y[k][j];
	                }
	            }
	        }
	        System.out.println("The product is:");
	        for (int i = 0; i < r2; i++)
	        {
	            for (int j = 0; j < c2; j++)
	            {
	            	
	                System.out.print(z[i][j] + " ");
	            }
	           System.out.println();
	        }
	        
	    }
	}

