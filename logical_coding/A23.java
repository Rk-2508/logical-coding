// Write a program to print fibonacci series using recursion in java.
package logical_coding;
public class A23 {
	static int a=0,b=1,c;
	public static void main(String[] args) {
		A23 a1 = new A23();
		a1.printFib(10);
	}
	void printFib(int i) {
		if(i>=1) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			printFib(i-1);
		}
	}
}
