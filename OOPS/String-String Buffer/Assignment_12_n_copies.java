import java.util.Scanner;

public class Assignment_12_n_copies {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String one = sc.nextLine();
		
		int length = one.length();
		
		if(length == 1) {
			System.out.println(one);
		}
		
		else {
		
		String two = one.substring(0,2);
		for(int i = 0; i < length; i++) {
			System.out.print(two);
			}
		
		}
	}

}
