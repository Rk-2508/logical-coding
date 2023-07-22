// Write a program to find factorial of the number using recursion in java.
package logical_coding;
public class A17 {
	static int fact = 1;
	public static void main(String[] args) {
		int no = 5;
		A17 a1 = new A17();
		a1.calcFact(no);
		System.out.println("Factorial of no is"+fact);
	}
	void calcFact(int no) {
		if(no>=1) {
			fact=fact*no;
			calcFact(no-1);
		}
	}
}
