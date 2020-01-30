package datatype;
import java.util.Scanner;
public class largerNum {
	public static void main(String[] args) 
    {
        int n1, n2, n3;
        Scanner see = new Scanner(System.in);
        System.out.print("Enter the first number:");
        n1 = see.nextInt();
        System.out.print("Enter the second number:");
        n2 = see.nextInt();
        System.out.print("Enter the third number:");
        n3 = see.nextInt();
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("Largest number is:"+n1);
        }
        else if(n2 > n3)
        {
            System.out.println("Largest number is:"+n2);
        }
        else
        {
            System.out.println("Largest number is:"+n3);
        }
}}
