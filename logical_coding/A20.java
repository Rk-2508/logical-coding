// Write a program to check for prime numbers in java.
package logical_coding;
public class A20 {
	public static void main(String[] args) {
	int temp=0;
	int no=9;
	for(int i=2; i<=no-1;i++) {
		if(no%i==0) {
			temp=temp+1;
		}
	}
	if(temp==0) {
		System.out.println("no is prime");
	}
	else {
		System.out.println("no is not prime");
	}
	}
}
