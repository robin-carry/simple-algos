package Sorting;
public class MergeSort {
	
	public static void main(String[] args) {
		int[] input = {10,2,4,3,8,5,9,1,7,6};
		MergeSort sort = new MergeSort();
		sort.doSort(input, 0, input.length - 1);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + "\t");
		}
	}

	public void doSort(int[] input, int p, int r) {
		if(p < r) {
			int q = p + ((r - p)/2);
			doSort(input, p, q);
			doSort(input, q + 1, r);
			merge(input, p, q, r);
		}
	}

	public void merge(int[] input, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i = 0; i < n1; i++) {
			left[i] = input[p + i];
		}
		for(int i = 0; i < n2; i++) {
			right[i] = input[q + i + 1];
		}
		int i = 0, j = 0;
		for(int k = p; k <= r; k++) {
            if(i >= left.length) {
                input[k] = right[j++];
                continue;
            }
            if(j >= right.length) {
                input[k] = left[i++];
                continue;
            }
			if(left[i] <= right[j]) {
				input[k] = left[i];
				i++;
			} else {
				input[k] = right[j];
				j++;
			}
		}
	}
}