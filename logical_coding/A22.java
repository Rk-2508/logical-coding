// Write a program to print fibonacci series in java.
package logical_coding;
public class A22 {
	public static void main(String[] args) {
		int a=0,b=1,c;
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
