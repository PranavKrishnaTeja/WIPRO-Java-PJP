import java.util.Scanner;

public class tm_01_handson_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int nums = num;
		int digit = 0;
		int reverse = 0;
		
		while(num > 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if (nums == reverse) {
			System.out.println(nums+" Is a palindrome");
		}
		else {
			System.out.println(nums+" Is not palindrome");
		}

	}

}
