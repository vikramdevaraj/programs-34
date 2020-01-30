package looping;
import java.util.Scanner;

public class perfectsquare {
	public static void main(String[] args) {
		Scanner fan=new Scanner(System.in);
		int number=fan.nextInt();
		 int sqrt = (int)Math.sqrt(number);
		 System.out.println(sqrt);
     if(sqrt*sqrt == number) {
         System.out.println(number+" is a perfect square number!");
     }else {
         System.out.println(number+" is NOT a perfect square number!");
     }
}}
