
public class tm_01_handson_22 {

	public static void main(String[] args) {
		int count = 0, num = 1;
		while(count < 5) {
			if(num % 2== 0 && num % 3 == 0 && num % 5 == 0) {
				System.out.println(num);
				count++;
			}
			num++;
		}

	}

}
