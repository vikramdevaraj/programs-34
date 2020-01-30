package datatype;
import java.util.Scanner;
public class multiply {

	public static void main(String[] args) 
	{
	   int mul1;int mul2;
	   Scanner aa=new Scanner(System.in);
	   System.out.println("enter the number mul1");
       mul1=aa.nextInt();
       System.out.println("enter the number mul2");
       mul2=aa.nextInt();
       int multiply=mul1*mul2;
       System.out.println(" multiply="+multiply);
	}

}
