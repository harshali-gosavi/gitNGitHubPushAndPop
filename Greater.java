// program for Greater number between two or 3 no.s in java
import java.util.Scanner;
public class Greater{
	 
	 public int greaterNumber(int a, int b){
		 if(a>b){
			System.out.println("greater number is: " + a);
		 }else{
			 System.out.println("Greater number is b: " +b);
		 }
		return 0;
	 }
	 
	 
	 public int greaterThree(int a, int b, int c){
		 if(a>b && a>c){
			 System.out.println("Greater no. is: " + a);
		 }else if(b>c && b>a){
			 System.out.println("Greater no is: " +b);
		 }else{
			 System.out.println("Greater no is: "+ c);
		 }
		 
		 return 0;
	 }
	 
	 public static void main(String[] args){
		 //witout scanner
		  Greater g = new Greater();
		//  g.greaterNumber(5,10);
		//g.greaterThree(8,16,9);
		
		//with Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		g.greaterNumber(a,b);
		g.greaterThree(a,b,c);
	 }
}
			