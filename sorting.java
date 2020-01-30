package scratch;
import java.util.Arrays;
import java.util.Collections;
public class sorting {

	public static void main(String[] args) 
	{
		Integer[] arr= {12,21,43,5,85,1};
		System.out.println(arr.length);
		Arrays.sort(arr);
		System.out.println("array arr"+Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("array arr"+Arrays.toString(arr));

	}

}
