
public class tm_01_handson_30 {

	public static void main(String[] args) {
		int arr[] = {6,8,9,1,5,7,3,4,5};
		int num = 6;
		int num1 = 7;
		int num2 = 0;
		int num3 = 0;		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				num2 = i;	
			}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == num1) {
				num3 = j;
			}	
		}
		
		}
		if(num2 < num3) {
			for(int k = 0; k < num2; k++) {
				sum = arr[k] + sum;
			}
			for(int m = num3 + 1; m < arr.length; m++) {
				sum = arr[m] + sum;
			}
			
		}
		else {
			for(int y = 0; y < arr.length; y++) {
				sum = sum + arr[y];
			}
		}
		System.out.print(sum);
	}

}
