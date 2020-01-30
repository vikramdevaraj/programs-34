package looping;
import java.util.Scanner;
public class oddoreven
{
	public static void main(String[] args)
	{
		int number;
		int i;
		Scanner can=new Scanner(System.in);
		System.out.println("enter the number");
		number=can.nextInt();
		System.out.println("even");
		for(i=2;i<=number;i++)
		{
			System.out.println(+i);
		i=i+1;
		}
		System.out.println("odd");
		for(i=1;i<=number;i++)
		{
			System.out.println(+i);
			i=i+1;
			
		}}
	

}
