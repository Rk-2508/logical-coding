// Find maximum values in an array.
package logical_coding;
public class A5 {
	public static void main(String[] args) {
		int[] arr = {5,6,4,8,9,3};
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max value is"+max);
	}
}
