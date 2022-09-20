import java.util.Arrays;

public class SortWithNormalArray {
	int[] data = { 6, 7, 2, 7, 4 };

	private void sort() {
		if (data == null || data.length <= 0)
			return;
		int len = data.length;
		for (int i = 0; i < len; ++i) {
			int nextMinPos = minpos(i, len - 1);
			swap(i, nextMinPos);
		}

	}

	int minpos(int i, int j) {
		int pos = i;
		int min = data[i];
		for (int k = i; k <= j; k++) {
			if (data[k] < min) {
				pos = k;
				min = data[k];
			}
		}
		return pos;
	}

	void swap(int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	public static void main(String[] args) {
		SortWithNormalArray swn = new SortWithNormalArray();
		System.out.println(Arrays.toString(swn.data));
		System.out.println("After Sort");
		swn.sort();
		System.out.println(Arrays.toString(swn.data));
	}
}
