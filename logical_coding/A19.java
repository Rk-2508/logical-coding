// Write a program to reverse a string in java.
package logical_coding;
public class A19 {
	public static void main(String[] args) {
		String name = "SHUBHAM";
		int leng = name.length();
		String rev = "";
		for(int i=leng-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse of name is:"+rev);
	}
}
