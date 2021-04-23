import java.util.Scanner;

public class Assignment_15_short_long_short {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String a = sc.nextLine();
		int num = a.length();
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String b = sc.nextLine();
		int num1 = b.length();

		if(num == num1) {
			System.out.println("The length of input should vary.Same length of word should not be given as input");
		}
		
		else if(num > num1) {
			System.out.println(b+a+b);
		}
		
		else {
			System.out.println(a+b+a);
		}
	}

}
