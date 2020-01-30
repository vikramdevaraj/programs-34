package looping;
import java.util.*;
public class sumofnNum {
	public static void main(String[] args) {

        int num, flow, total = 0;
        System.out.println("Enter the value of n:");
        Scanner sn = new Scanner(System.in);
        num = sn.nextInt();
        for(flow = 1; flow <= num; flow++){
            total = total + flow;
        }

        System.out.println("Sum of first "+num+" natural numbers is: "+total);
    }
}


