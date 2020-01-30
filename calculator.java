package switchcase;
import java.util.Scanner;

public class calculator 
{

	public static void main(String[]args)
	{
		double n1, n2;
		Scanner cal=new Scanner(System.in);
		System.out.println("enter number1");
	    n1=cal.nextDouble();
		System.out.println("enter number2");
	    n2=cal.nextDouble();
		System.out.println("enter the operator +,-,*,/");
		char operator=cal.next().charAt(0);
		double output=0;
		switch(operator)
		{
            case '+':
            	output = n1 + n2;
                break;

            case '-':
            	output = n1 - n2;
                break;

            case '*':
            	output = n1 * n2;
                break;

            case '/':
            	output = n1 / n2;
                break;	
                
		}
		System.out.println("answer"+output);
	}
}