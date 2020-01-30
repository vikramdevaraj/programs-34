package datatype;
import java.util.Random;

public class randomnum {
	public static void main(String[ ] args)
	{
		int i;
		int random;
		Random run=new Random();
		System.out.println("randomnumber");
		for(i=0;i<4;i++)
			{
			 random=run.nextInt(150);
			 System.out.println(random);
			}
		
	}
}
