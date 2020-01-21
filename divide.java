package scratch;
import java.util.Scanner;
public class divide 
{
public static void main(String[] args)
{
	float quotient;
	int remainder;
	Scanner prem = new Scanner(System.in);
	System.out.println("enter divisor");
	int divisor=prem.nextInt();
	System.out.println("enter divident");
	int divident=prem.nextInt();
	quotient=divident/divisor;
	System.out.println("quotient is"+quotient);
	remainder=divident%divisor;
	System.out.println("remainder is"+remainder);
	
}
}
