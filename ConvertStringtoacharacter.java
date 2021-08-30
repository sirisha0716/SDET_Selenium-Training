package Programs;

public class ConvertStringtoacharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Welcome to Programming";    
		char[] ch=s1.toCharArray();    
		for(int i=0;i<ch.length;i++){    
		System.out.println("char at "+i+" index is: "+ch[i]);   
		}   
		 
		char c='W';    
		String s=Character.toString(c);  
		System.out.println("String is: "+s);  


	}
}
