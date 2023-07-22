// Find the missing number in an array.
package logical_coding;
public class A36 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		int expected_no_elements=arr.length+1;
		int total_sum=expected_no_elements *(expected_no_elements+1)/2;
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("missing no is :"+(total_sum-sum));
	}
}
