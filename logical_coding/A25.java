// Write a program to check for armstrong number in java.
package logical_coding;
public class A25 {
	public static void main(String[] args) {
		int no=153;
		int temp1=no;
		int leng=0;
		while(temp1 != 0) {
			leng=leng+1;
			temp1=temp1/10;
		}
		int temp2=no;
		int arm=0;
		int rem;
		while(temp2 != 0) {
			int mul=1;
			rem=temp2%10;
			for(int i=1;i<=leng;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		if(arm==no) {
			System.out.println("no is armstrong");
		}
		else {
			System.out.println("no is not armstrong");
		}
	}
}
