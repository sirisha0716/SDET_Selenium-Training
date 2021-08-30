package Programs;

public class ArithmeticException {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		 //  this throws error 
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int i =a/b;
		System.out.println(i);
		
		}
		
		catch(ArithmeticException ae)
		{
		
		System.err.println("Exception Caught");
				
		}
		catch(NumberFormatException  ae) {
			System.err.println("Enter only integer values");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("Both the values are needed");
		}
		// Exception class can handle all type of exceptions
		catch(Exception e) {
			System.err.println("Unknown exception");
		}
		finally {
			System.out.println("Main Ends");
		}
		
	}

}
