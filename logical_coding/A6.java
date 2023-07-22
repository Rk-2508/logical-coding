// Find minimum value in an array.
package logical_coding;
public class A6 {
	public static void main(String[] args) {
		int[] arr = {5,6,4,8,9,3};
		int min = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min value is" + min);
	}
}
