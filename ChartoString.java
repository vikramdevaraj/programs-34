
package string;
import java.util.Arrays;
public class ChartoString {

	public static void main(String[] args) {
		char[] chars = {'v','i','k','r','a','m','\t'};
		System.out.println(chars.length);
String string = Arrays.toString(chars).substring(1, 3*chars.length-1).replace(", ", "");
String string1 = new String(chars);
String string2=String.valueOf(chars);
System.out.println(string+" "+string1+" "+string2);


	}

}
