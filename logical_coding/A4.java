// How to sort an array in java.
package logical_coding;
import java.util.Arrays;
public class A4 {
	public static void main(String[] args) {
		int [] arr = {1,5,4,2,3};
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
