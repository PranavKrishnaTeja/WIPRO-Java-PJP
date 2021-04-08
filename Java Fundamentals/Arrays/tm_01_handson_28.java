
public class tm_01_handson_28 {

	public static void main(String[] args) {
int[] array = {19, 14, 20, 18, 2};
		
		
		for(int i = 0; i < array.length-1; i++) {						
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		
		System.out.print("Sorted Array : ");
		for(int element : array) {
			System.out.print(element + " ");
		}
	}

}