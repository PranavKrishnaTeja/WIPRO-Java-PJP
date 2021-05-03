import java.util.Scanner;

public class Assignment_17_asterisk {

	public static void main(String[] args) {
		String word1 = "";
		String word2 = "";
		System.out.print("Enter the word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int num = word.indexOf("*");
		if(word.contains("*") == true) {
		word1 = word.substring(0, num-1);
		word2 = word.substring(num+2);
		
		System.out.println(word1+word2);
		}
		else {
			System.out.println(word);
		}
	}

}
