import java.util.*;

public class tm_01_handson_32 {

	public static void main(String[] args) {
	if (args.length < 9) {
		System.out.println("Please enter 9 integer numbers");
	}
	else {
		int arr [][] = new int [3][3];
		int x = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(args[x]);
				x++;
			}
		}
		System.out.println("The given array is: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
	}
			System.out.println();
	}
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0;j < arr.length; j++) {
				if(arr[i][j] > max)
					max = arr[i][j];
			}
		}
		System.out.println("The biggest number in the given array is "+max);

}
	
	}
}
