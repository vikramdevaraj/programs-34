package math;
import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		double width;
		double height;
		Scanner bb=new Scanner(System.in);
		System.out.println("enter the width");
		width=bb.nextDouble();
		System.out.println("enter the height");
		height=bb.nextDouble();
		double area=width*height;
		System.out.println("area of rectangle="+area);
	}

}
