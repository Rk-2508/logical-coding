// Find 2nd largest elements in an array.
package logical_coding;
public class A7 {
	public static void main(String[] args) {
		int temp;
		int[] arr = {2,3,8,5,1,7};
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("second largest elements is" + arr[1]);
	}
}
