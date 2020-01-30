package datatype;

public class Convertion {
	public static void main(String[] args)
	{
		int bun=100;
		String stn1=String.valueOf(bun) ;
		String stn2=Integer.toString(bun);
		System.out.println(stn1+stn2);
		long i1=Long.valueOf(stn1+stn2);
		Float f1=Float.valueOf(i1);
		System.out.println(i1+f1);
	}

}
 