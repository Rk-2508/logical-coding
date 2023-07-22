// Find kth largest elements in an array.
package logical_coding;
public class A9 {
	public static void main(String[] args) {
		int temp;
		int[] arr = {2,5,4,6,8,9};
		int k=3;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("kth largest elements is" + arr[i]);
			}
		}
	}
}
