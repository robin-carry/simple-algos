package Sorting;
public class InsertionSort {
	
	public static void main(String[] args) {
		int[] input = {5, 2, 4, 6, 1, 3};
		InsertionSort sort = new InsertionSort();
		sort.doInsertionSort(input);
        for(int i = 0; i < input.length; i++)
		    System.out.print(input[i] + "\t");
	}

	public void doInsertionSort(int[] input) {
		for(int j = 1; j < input.length; j++) {
			int key = input[j];
			int i = j - 1;
			while(i >= 0 && input[i] > key) {
			  input[i + 1] = input[i];
			  i--;
			}
			input[i + 1] = key;
		}
	}

}