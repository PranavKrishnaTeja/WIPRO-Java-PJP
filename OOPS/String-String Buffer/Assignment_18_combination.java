import java.util.Scanner;

public class Assignment_18_combination {

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
		int i = 0;
		if(num == num1) {
		while(i < num){
			String ver = rev + a.substring(i, i+1) + b.substring(i, i+1);
			System.out.print(ver);
			i++;
			}
		}
		
		else if(num > num1) {
			for(i = 0; i < num1;i++){
				rev = rev + a.charAt(i);
				rev = rev + b.charAt(i);
				
				}
			rev = rev +a.substring(num1, num);
			System.out.println(rev);
			
		}
		
		else if(num < num1) {
			for(i = 0; i < num; i++){
				rev = rev + a.charAt(i);
				rev = rev + b.charAt(i);
				}
			rev = rev + b.substring(num, num1);
			System.out.println(rev);
		}
	}

}
