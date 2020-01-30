package math;
import java.util.Scanner;
public class triangle
{
	public static void main(String[] args)
	{
		double base;
		double height;
		double triangle;
		Scanner tttt=new Scanner(System.in);
		System.out.println("enter the base");
		base=tttt.nextDouble();
		System.out.println("enter the height");
		height=tttt.nextDouble();
		triangle=0.5*base*height;
		System.out.println("area of triange="+triangle);
	}

}
