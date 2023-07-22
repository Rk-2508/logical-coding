// Write a program to split the string.
package logical_coding;
public class A35 {
	public static void main(String[] args) {
		String s1 = "I Love My India";
		String s2[]=s1.split("\\s");
		for(String x:s2) {
			System.out.println(x);
		}
	}
}
