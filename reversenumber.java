package datatype;
import java.util.Scanner;
public class reversenumber {
	public static void main(String args[])
	   {
	      int num;
	      int reverse =0;
	      System.out.println("number: ");	      
	      Scanner in = new Scanner(System.in);
	      num = in.nextInt();
	      while( num != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse number is: "+reverse);
	   
	for( ;num != 0; )
    {
        reverse = reverse * 10;
        reverse = reverse + num%10;
        num = num/10;
    }
    System.out.println("Reverse number is: "+reverse);
}
}