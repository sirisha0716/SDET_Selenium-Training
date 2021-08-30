package Programs;

public class NaturalNumbers {
	public static void main(String args[]) {

		//method that returns the sum of n natural numbers   
		   
		int sum = 0, n = 20;   
		//executes until the condition becomes false  
		for (int i = 1; i <= n; i++)    
		sum = sum + i;       
		   
		//calling method and prints the sum  
		System.out.println("Sum of Natural Numbers is: "+sum);  
		}    

}
