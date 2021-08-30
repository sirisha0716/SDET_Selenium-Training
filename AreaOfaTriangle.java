package assignments_SDET; 
2 
 
3 import java.util.Scanner; 
4 
 
5 public class AreaOfaTriangle { 
6 	public static void main(String[] args) { 
7 		// TODO Auto-generated method stub 
8 		 
9 		@SuppressWarnings("resource") 
10 		Scanner scanner = new Scanner(System.in); 
11 
 
12 	      System.out.println("Enter the width of the Triangle:"); 
13 	      double base = scanner.nextDouble(); 
14 
 
15 	      System.out.println("Enter the height of the Triangle:"); 
16 	      double height = scanner.nextDouble(); 
17 
 
18 	      //Area = (width*height)/2 
19 	      double area = (base* height)/2; 
20 	      System.out.println("Area of Triangle is: " + area);       
21 
 
22 
 
23 	} 
24 
 
25 
 
26 } 
