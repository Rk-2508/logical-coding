// Bubble sort in java
package logical_coding;
public class A11 {
	public static void main(String[] args) {
		int temp;
		int flag = 0;
		int [] array = {36,19,29,12,5};
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0) {
				break;
			}
		}
			for(int i=0; i<array.length; i++) {
				System.out.println(array[i]+"");
			}
		}
	}
