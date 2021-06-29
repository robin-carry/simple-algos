// PENDING : NOT COMPLETED!!! :'(
package Special;
import java.util.Arrays;

public class Inversion {
	
	public static void main(String[] args) {
		int[] input = {10,2,4,3,8,5}; // Actual Answer: (10, 2), (10, 4), (10, 3), (10, 8), (10, 5) / (4, 3) / (8, 5) - 7.
		int[] originalInput = Arrays.copyOf(input, input.length);
		Inversion i = new Inversion();
		int result = i.sortWithInversion(input);
		System.out.print("Original Input: ");
        for(int val : originalInput) {
            System.out.print(val + "\t");
        }
    	System.out.println();
    	System.out.print("Sorted Output: ");
        for(int val : input) {
            System.out.print(val + "\t");
        }
		System.out.println();
		System.out.println("Final Number of Inversions: " + result);
	}

	public int sortWithInversion(int[] input) {
		return mergeSort(input, 0, input.length - 1);
	}

	private int mergeSort(int[] input, int p, int r) {
		if(p < r) {
			int q = p + ((r - p)/2); // To avoid overflow
			int left = mergeSort(input, p, q);
			int right = mergeSort(input, q + 1, r);
			return merging(input, p, q, r) + left + right;
		}
		return 0;
	}

	private int merging(int[] input, int p, int q, int r) {
		int inv = 0;
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i = 0; i < n1; i++) left[i] = input[p + i];
		for(int i = 0; i < n2; i++) right[i] = input[q + i + 1];
		int i = 0, j = 0;
		for(int k = p; k <=r; k++) {
			if(i >= left.length) {
				input[k] = right[j++];
                continue;
			}
			if(j >= right.length) {
				input[k] = left[i++];
				inv++;
                continue;
			}
			if(left[i] > right[j]) {
				input[k] = right[j];
                if(i != j) {
					inv++;
				}
				j++;
			} else {
				input[k] = left[i++];
			}
		}
		return inv;
	}
}