// Check whether a given string is palindrome or not.
package logical_coding;
public class A30 {
	public static void main(String[] args) {
		String str = "NAMAN";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a palindrome string");
		}
	}
}
