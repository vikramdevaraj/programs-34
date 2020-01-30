package scratch;
import java.util.Scanner;
public class powers 
{
public static void main(String[] args)
{
	int number;
	int power;
	int powerofno=1;
	Scanner loki=new Scanner(System.in);
	System.out.println("enter a numer");
	number=loki.nextInt();
	System.out.println("enter the power");
	power=loki.nextInt();
	for(int i=1;i<=power;i++)
	{
		powerofno=powerofno*number;
		
	}
	System.out.println("power of no is"+powerofno);
	
		
}
}
