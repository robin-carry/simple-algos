package Sorting;
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] input = {10,2,4,3,8,5,9,1,7,6};
		BubbleSort sort = new BubbleSort();
		sort.doSort(input);
		for(int val : input) {
			System.out.print(val + "\t");
		}
	}

	public void doSort(int[] input) {
		for(int i = 0; i < input.length - 1; i++) {
			for(int j = input.length - 1; j > i; j--) {
				if(input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
	}
}