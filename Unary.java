public class Unary{
	
	int c;
	public int arithmatic(int a, int b){
		System.out.println("additin is: " + (a+b));
		System.out.println("multiplication is: " + (a*b));
        System.out.println("division is: " + (a/b));
        System.out.println("substraction is : " + (a-b));
		System.out.println((a*b/a+b-a*b/a));                          //2*4/2+4-2*4/2 = 8/2+4-8/2=4+4-4=8-4=4     (paranthersis)->expontial->multiplication-> division->additin->substraction
       return c;                                                          //()->x^2->*or /->+ or -
	}	   
		
     public static void main(String[] args){
		 
	    int a=15;
		int b=20;
		int c;
		int d=20;
		int x=-12;
		boolean y=false;
		boolean z= true;
		System.out.println(a++);                         //15(16)
		
		System.out.println(a--);                         //16(15)
		System.out.println(++a);                         //16(16)
		System.out.println(--a);                         //15(15)
		System.out.println(a++);                          //15(16)
	     c = (a++ + b++);             //16(17)+20(21)=36
		System.out.println(++c);    //37
		System.out.println(~x);     //11
		System.out.println(~d);      //-21
		System.out.println(!y +" and " + !z);       //true and false
		
		Unary u = new Unary();
		u.arithmatic(2,4);
   }
  }