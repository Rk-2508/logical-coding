// Find maximum repeated character in string.
package logical_coding;
public class A31 {
	public static void main(String[] args) {
		String str = "abbccc";
		int[] arr = new int[125];
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max = -1;
		char c = ' ';
		
		for(int i=0; i<str.length(); i++) {
			if(max<arr[str.charAt(i)]) {
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		System.out.println("Maximum repeated charcter is "+c);
	}
}	