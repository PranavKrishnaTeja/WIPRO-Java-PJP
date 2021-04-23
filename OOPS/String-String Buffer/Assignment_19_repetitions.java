import java.util.Scanner;

public class Assignment_19_repetitions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String a = sc.nextLine();
		int num = a.length();
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter n: ");
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			System.out.print(a.substring(b-1, num));
		}

	}

}
