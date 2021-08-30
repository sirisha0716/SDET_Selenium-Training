package assignments_SDET; 
2 
 
3 import java.util.Arrays; 
4 
 
5 public class AlphabeticallySort { 
6 
 
7 	public static void main(String[] args) { 
8 		// TODO Auto-generated method stub 
9 		//defining an array of type String   
10 		String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};   
11 		int size = countries.length;   
12 		//logic for sorting    
13 		for(int i = 0; i<size-1; i++)    
14 		{   
15 		for (int j = i+1; j<countries.length; j++)    
16 		{   
17 		//compares each elements of the array to all the remaining elements   
18 		if(countries[i].compareTo(countries[j])>0)    
19 		{   
20 		//swapping array elements   
21 		String temp = countries[i];   
22 		countries[i] = countries[j];   
23 		countries[j] = temp;   
24 		}   
25 		}   
26 		}   
27 		//prints the sorted array in ascending order   
28 		System.out.println(Arrays.toString(countries));   
29 
 
30 	} 
31 
 
32 } 
