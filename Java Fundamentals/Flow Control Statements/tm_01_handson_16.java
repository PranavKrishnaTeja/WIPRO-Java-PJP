
public class tm_01_handson_16 {

	public static void main(String[] args) {
		for(int i=10; i <= 99; ++i) {
			if(i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7 == 0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}

	}

}