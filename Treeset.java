package Programs;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(100);  
        set.add(200);  
        set.add(-49);  
        set.add(-50);  
        System.out.println("Lowest Value: "+set.pollFirst());  
        System.out.println("Highest Value: "+set.pollLast());  

	}

}

