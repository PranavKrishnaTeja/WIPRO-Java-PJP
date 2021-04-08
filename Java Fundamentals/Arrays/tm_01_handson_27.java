import java.util.Arrays;

public class tm_01_handson_27 {

	public static void main(String[] args) {
		int arr[] = {4,8,9,2,44,23,78,91,59,24,246,120,115};
		Arrays.sort(arr);
		System.out.println("Largest two numbers are "+arr[arr.length-1]+", "+arr[arr.length-2]);
		System.out.println("Smallest two numbers are "+arr[0]+", "+arr[1]);
		
	}

}
