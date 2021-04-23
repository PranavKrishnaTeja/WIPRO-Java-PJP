import java.util.Scanner;

public class Assignment_13_first_half {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String one = sc.nextLine();
		int num = one.length();
		
		if(num % 2 == 0) {
			num = num/2;
			System.out.println(one.substring(0, num));
		}
		else {
			System.out.println("null");
		}

	}

}
