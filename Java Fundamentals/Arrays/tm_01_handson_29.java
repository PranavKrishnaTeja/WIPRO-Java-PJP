import java.util.*;
public class tm_01_handson_29 {

	public static void main(String[] args) {
		int[] arr = {4,5,8,7,6,3,2,1,9,5,2,5,5,2,2,1,3,35,45,1,5,12,629,6285,15,250,32};
		
		Arrays.sort(arr);									
		int[] temp = new int[arr.length];
		int j = 0;											
		for (int i = 0; i < arr.length-1; i++){
			if (arr[i] != arr[i+1]){
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j++] = arr[arr.length-1];
		for (int i = 0; i < j; i++){
			System.out.print(temp[i]+" ");  				
		}
	}
	
}