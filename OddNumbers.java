package Programs;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("List of odd numbers: ");       
		//method calling  
		displayOddNumbers(79, 187);   
		}   
		//method that checks the number is odd or not  
		private static void displayOddNumbers(int number, int end)   
		{   
		if(number>end)   
		return;   
		if(number%2!=0)   
		{   
		//prints the odd numbers  
		System.out.print(number +" ");   
		//calling the method and increments the number by 2 if the number is odd  
		displayOddNumbers(number + 2, end);   
		}   
		else   
		{   
		//increments the number by 1 if the number is odd  
		displayOddNumbers(number + 1, end);   
		}   

	}

}