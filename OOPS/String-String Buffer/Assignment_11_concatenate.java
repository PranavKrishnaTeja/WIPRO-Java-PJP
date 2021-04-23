import java.util.*;
public class Assignment_11_concatenate {

	public static void main(String[] args) {
		int length1 = 0;
		int length2 = 0;
		Scanner sc = new Scanner(System.in);
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String one = sc.nextLine();
		System.out.println("Enter second string: ");
		String two = cs.nextLine();
		
		String rev = "";
		if(one.charAt(one.length() - 1) == two.charAt(0)) {
			rev = one.substring(0, one.length()-1) + two;
			System.out.println(rev);
		}
		else {
			System.out.println(one +" " + two);
		}

	}

}
