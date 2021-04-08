import java.util.Scanner;
public class tm_01_handson_8 {

	public static void main(String[] args) {
Scanner a = new Scanner(System.in);
		char var = a.next().charAt(0);
		
		if((var >= 65 && var <= 90) || (var >= 97 && var <= 122) ) {
			System.out.println("Alphabet");
		}
		else if(var >= 48 && var <= 57) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}

	}

}
