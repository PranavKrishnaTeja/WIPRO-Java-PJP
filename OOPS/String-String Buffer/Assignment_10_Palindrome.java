
public class Assignment_10_Palindrome {

	public static void main(String[] args) {
		String mystring = "anna";
		StringBuffer sbj = new StringBuffer(mystring);
		sbj.reverse();
		String jbs = sbj.toString();
		if(mystring.equals(jbs)) {
			System.out.println("is palindrome");
		}
		
		else {
			System.out.println("Not palindrome");
		}
		

	}

}
