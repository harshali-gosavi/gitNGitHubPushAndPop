public class Addition{
int sum;
    public int addition(int a, int b){
	  sum=a+b;
	  System.out.println("Addition of two no.s is : " + sum);
	  return sum;
	 }
        public static void main(String[] args){
		    Addition add = new Addition();
			add.addition(10,20);
			
		}
}