import java.util.Scanner;

public class Assignment_14_new_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String one = sc.nextLine();
		int num = one.length();
		
		System.out.println(one.substring(1, num-1));
	}

}
