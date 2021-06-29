package Sorting;
public class InsertionSortRec {
    public static void main(String[] args) {
		int[] input = {10,2,4,3,8,5,9,1,7,6};
		InsertionSortRec sorter = new InsertionSortRec();
		sorter.doSort(input, 0, input.length - 1);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t");
		}
	}

	public void doSort(int[] input, int p, int q) {
		if(p < q) {
			doSort(input, p, q - 1);
			insert(input, p, q, q - 1);
		}
	}

	public void insert(int[] input, int p, int q, int r) {
		int key = input[q];
		int i = r;
		while(i >=0 && input[i] > key) {
			input[i + 1] = input[i];
			i--;
		}
		input[i + 1] = key;
	}    
}
