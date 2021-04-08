
public class tm_01_handson_18 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;

		while(num > 0){
			int rem = num%10;
			sum = sum + rem;
			num/=10;
		}

		System.out.println(sum);
	}
}