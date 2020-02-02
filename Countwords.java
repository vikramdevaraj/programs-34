package string;
import java.util.Scanner;
public class Countwords {
	public static void main(String args[])
	    {
	        String text;
	        int countWords=1;
	         
	        Scanner SC=new Scanner(System.in);
	         
	        System.out.print("Enter string: ");
	        text= SC.nextLine();
	        for(int i=0; i<text.length(); i++)
	        {
	            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ' ||text.charAt(i)=='.')
	                ++countWords;
	        }
	         
	        System.out.println("Total number of words in string are: "+ countWords);
	       
	         

	    }
}
