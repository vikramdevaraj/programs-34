package string;
import java.util.Scanner;
public class Reverseword {
	public static void main(String[] args) 
    { 
		Scanner sa=new Scanner(System.in) ;
		System.out.println("enthe the sentence");
		String revsentence=sa.nextLine();
		
        String s[] = revsentence.split(" "); 
        String ans = ""; 
        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
        System.out.println("Reversed String:"); 
        System.out.println(ans); 
    } 
}
