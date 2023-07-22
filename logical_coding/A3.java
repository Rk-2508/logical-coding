// Swap two numbers without using third variables.
package logical_coding;
public class A3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a+b; //30
		b = a-b; //10
		a = a-b; //20
		System.out.println(a);
		System.out.println(b);
	}
}
