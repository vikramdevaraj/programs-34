package math;
import java.util.Scanner;
public class square {
	public static void main(String[] args) 
	{
		double  length;
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the length");
		length=ss.nextDouble();
		double square=Math.pow(length, 2);
		System.out.println("area of square="+square);
		
	}
}
