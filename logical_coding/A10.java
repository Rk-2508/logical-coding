// Find duplicate elements in an array.(Brute force method)
package logical_coding;
public class A10 {
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,5,6};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j] && (i != j)) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
