package string;
import java.util.Scanner;
public class DuplicateChar {

	public static void main(String[] args) {
		String str ;
		  System.out.println("enter the string");
		  Scanner sc = new Scanner(System.in);
		  str = sc.nextLine();
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++)
		  {
		   for (int j = i + 1; j < str.length(); j++)
		   {
		    if (inp[i] == inp[j])
		    {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
		 System.out.println(+cnt);

	}

}
