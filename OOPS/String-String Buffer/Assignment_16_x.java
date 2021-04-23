import java.util.Scanner;

public class Assignment_16_x {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String one = sc.nextLine();
		int num = one.length();

		if(one.charAt(0) == 'x' && one.charAt(num-1) == 'x' || one.charAt(0) == 'X' && one.charAt(num-1) == 'X') {
			System.out.println(one.substring(1, num-1));
		}
		else if(one.charAt(0) == 'x' || one.charAt(0) == 'X') {
			System.out.println(one.substring(1, num));
		}
		
		else if(one.charAt(num-1) == 'x' || one.charAt(num-1) == 'X') {
			System.out.println(one.substring(0, num-1));
		}
		
		else {
			System.out.println(one);
		}
	}

}
