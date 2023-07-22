// Find first non repeated character in a string.
package logical_coding;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class A28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any text");
		String str = sc.nextLine().toLowerCase();
		// We are creating hashmap to check whether character is repeated or not.
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		boolean status = false;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}else {
				map.put(ch,map.get(ch)+1);
			}
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.get(ch)==1) {
				System.out.println("First non-repeated character in a given string text is:" +ch);
				status = true;
				break;
			}
		}
		if(!status) {
			System.out.println("There is no unique character in the given string text");
		}
	}
}
