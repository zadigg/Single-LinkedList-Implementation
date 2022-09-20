
public class recursiveBinarySearch {

	private void recursiveSearch(int[] data, int Lb, int Hb, int key) {
		boolean flag = false;
		if (data.length <= 0 || data == null)
			return;
		int mid = (Lb + Hb) / 2;
		while (Lb <= Hb) {
			if (data[mid] == key) {
				System.out.println("Element is Found On Index: " + mid);
				flag = true;
				break;
			}

			if (key < data[mid]) {

				recursiveSearch(data, Lb, mid - 1, key);
				break;
			}

			if (key > data[mid]) {

				recursiveSearch(data, mid + 1, Hb, key);
				break;
			}

		}
		
	}

	public static void main(String[] args) {
		recursiveBinarySearch rbs = new recursiveBinarySearch();
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int lowerBound = 0;
		int higherBound = data.length - 1;
		int key = 8;
		rbs.recursiveSearch(data, lowerBound, higherBound, key);
	}
}
