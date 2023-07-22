/*Write a program to check opening and closing brackets if same don't give me 
   error if not same give me error. */
package logical_coding;
public class A27 {
	public static void main(String[] args) {
		String str = "(((()))";
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') {
				count1++;
			}else if(str.charAt(i)==')') {
				count2++;
			}
		}
		if(count1==count2) {
			System.out.println("No error");
		}else {
			System.out.println("Error");
		}
	}
}
