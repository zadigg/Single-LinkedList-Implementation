
public class BinarySearch {

	private void iterativeBinarySearch(int[] data) {
		
		boolean flag = false;

		int key = 6;
		int lowerBound = 0;
		int higherBound = data.length - 1;

		while (lowerBound <= higherBound) {
			int mid = (lowerBound + higherBound) / 2;
			if (data[mid] == key) {
				System.out.println("Element found on Index: " + mid);
				flag = true;
				break;
			}

			if (key > mid) {
				lowerBound = mid + 1;
			}
			if (key < mid) {
				higherBound = mid - 1;
			}
		}
		if (!flag) {
			System.out.println("Element Not Found");
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		bs.iterativeBinarySearch(data);

	}

}
