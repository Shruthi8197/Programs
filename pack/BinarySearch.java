package pack;

public class BinarySearch {

	int binarySearch(int arr[], int x) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int m = left + (right - left) / 2;
			if (arr[m] == x)
				return m;
			if (arr[m] < x)
				left = m + 1;
			else
				right = m - 1;
		}

		return -1;
	}

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40, 20 };
		int n = arr.length;
		int x = 70;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}
