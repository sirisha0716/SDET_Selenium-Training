package Programs;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Pavan");  
		  hm.put(102,"Anshu");  
		  hm.put(101,"Pavan Kumar");  
		  hm.put(103,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}


}
