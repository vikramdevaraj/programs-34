package string;

public class StnStart {
	public static void main(String args[]) 
    { 
  
        
        String Str = new String("Welcome to springtool"); 
  
       
        System.out.print("Check whether string starts with welcome  : "); 
        System.out.println(Str.startsWith("Welcome", 0)); 
  
        
        System.out.print("Check whether string starts with spring: "); 
        System.out.println(Str.startsWith("spring", 11)); 
    } 

}
