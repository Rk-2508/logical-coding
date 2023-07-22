// Find the sum of all even and odd index from an array.
package logical_coding;
public class A29 {
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5,6,7,8};
		int even_sum = 0, odd_sum=0;
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				even_sum = even_sum+a[i];
			}
			else {
				odd_sum = odd_sum+a[i];
			}
		}
		System.out.println("Total sum of even index:" +even_sum);
		System.out.println("Total sum of odd index:" +odd_sum);
	}
	}
