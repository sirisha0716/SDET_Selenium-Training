package Programs;

public class NumberFormatException {
private static final String inputString = "99.99";  
    
    public static void main(String[] args) {  
        try {  
                 int a = Integer.parseInt(inputString);  
                 //System.out.println(a);
        }catch(Exception ex){  
            System.err.println("Invalid string in argumment");  
            //request for well-formatted string  
        }  
            }  


}
