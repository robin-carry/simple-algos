package Sorting;
public class SelectionSort {
	
	public static void main(String[] args) {
		int[] input = {5, 2, 4, 6, 1, 3};
		SelectionSort obj = new SelectionSort();
		obj.doSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t");
		}
	}

	public void doSort(int[] input) {
		for(int i = 0; i < input.length - 1;i++) {
			int minIndex = i + 1;
			for(int j = i + 1; j < input.length; j++) {
				if(input[j] < input[minIndex]) {
					minIndex = j;
				}
			}
			if(input[minIndex] < input[i]) {
				int temp = input[i];
				input[i] = input[minIndex];
				input[minIndex] = temp;
			}
		}
	}
}