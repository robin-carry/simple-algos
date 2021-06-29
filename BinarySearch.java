public class BinarySearch {
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7,8,9,10};
		BinarySearch bs = new BinarySearch();

		System.out.println("Does the value 2 exists in array:" + bs.search(input, 0, input.length - 1, 2));

		System.out.println("Does the value 11 exists in array:" + bs.search(input, 0, input.length - 1, 11));
	}

	public boolean search(int[] input, int left, int right, int searchTerm) {
		while(left < right) {
			//int mid = (right + left)/2; /// overflow issue 9 + 5 = 14 / 2 = 7 ()
			int mid = left + ((right - left)/2); // 5 + ((9 - 5)/2) --> 5 + 2 = 7
			int midVal = input[mid];
			if(midVal == searchTerm) {
				return true;
			}
			if(searchTerm > midVal) {
				return search(input, midVal + 1, right, searchTerm);
			} else {
				return search(input, left, midVal - 1, searchTerm);
			}
		}
		return false;
	}
}