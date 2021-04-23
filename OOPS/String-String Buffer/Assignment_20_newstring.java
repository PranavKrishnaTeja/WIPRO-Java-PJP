import java.util.Scanner;

public class Assignment_20_newstring {

	public static void main(String[] args) {
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String a = sc.nextLine();
		int num = a.length();
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String b = sc.nextLine();
		int num1 = b.length();
		
String outStr = "";
		
		while (a.indexOf(b) != -1) {	
			int index = a.indexOf(b);
			
			if (index == 0 && index + b.length() < a.length() - 1) {
				outStr += (a.charAt(index + b.length()));
				a = a.replaceFirst(b, "");
				continue;
			}
			
			if (index - 1 >= 0 && index + b.length() >= a.length()) {
				outStr += (a.charAt(index - 1));
				a = a.replaceFirst(b, "");
				continue;
			}
			
			if (index + b.length() < a.length() - 1 && index - 1 >= 0) {
				outStr += (a.charAt(index - 1));
				outStr += (a.charAt(index + b.length()));
				a = a.replaceFirst(b, "");
			}
		}

		System.out.println(outStr);
	}

}

