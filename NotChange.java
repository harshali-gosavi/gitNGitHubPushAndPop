public class NotChange{
	
 
    
	public void setchange(int a){
		 	System.out.println(a);
	}
	public int getchange(int a){
		return a;
	}
	
	public static void main(String[] args){
	
	 final NotChange not = new NotChange();
	  System.out.println( not.getchange(10));
	    System.out.println( not.getchange(16));
	  
	   
	   }
}
	   
	   