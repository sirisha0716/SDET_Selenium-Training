package Programs;

import java.util.*;

public class TrianagleArray
{
     private static Scanner sc;

	public static void main(String []args)
     {
         sc = new Scanner(System.in);   
         int i, j, k,r;            
          int a[]=new int[30];     
         
         System.out.println("Enter the number of rows ");
         r=sc.nextInt();     
    
         //For Triangle
         for(i=0;i<r;i++)   
		 {
			for(k=r; k>i; k--)    
			{
				System.out.print(" ");
			}
            a[i] = 0;   //Initialize the first element of each row as 0
			for(j=0;j<=i;j++)   
			{
				 System.out.print(a[i]+ " ");    
                 a[i] = a[i] * (i - j) / (j + 1);   
			}
			System.out.println();   
		 }
        
     }
}
