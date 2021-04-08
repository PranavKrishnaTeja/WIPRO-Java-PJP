
public class tm_01_handson_23 {

	public static void main(String[] args) {
		float sum = 0;
		float avg = 0;
		int arr[] = {2,4,6,8,7,9,2};
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
		}
		avg = (sum/arr.length);
		System.out.println(avg+" is the average value");
		System.out.println(sum+" is the sum");
	}

}
