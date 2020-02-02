package string;
import java.util.Scanner;
public class Upperlowercase {
	public static void main(String [] args) {
		String uplw;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the string");
		uplw = scan.nextLine();
		String lowercase=uplw.toLowerCase();
		String uppercase=uplw.toUpperCase();
		System.out.println(uplw.length());
		System.out.println("lower case:" +lowercase);
		System.out.println("upper case:" +uppercase);
		
		
		}
}
