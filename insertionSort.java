
public class insertionSort {
	public static void main(String[] args) {
		
		
		int[] ar = {22,27,16,2,18,6};
		
		insertionSort(ar);// o(1) constant time
		
		
		for(int i : ar) {
			System.out.print(" "+i);// o(1)
		}
		//Sýralandýkten sonra 18 average case
		
	}
	//Big-O =>  o(n^2) time complexity
	public static void insertionSort(int[] arr) {
		
		
		int n = arr.length; // o(1)
		
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // o(n) linear time
            int j = i - 1; // o(n) linear time
 
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // o(n) linear time
                j = j - 1; // o(n) linear time
            }
            arr[j + 1] = key; // o(n) linear time
        
        } // o(n^2)
		
	}
	
}
