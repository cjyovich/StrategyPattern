
public abstract class Client {
	SortBehavior sb;
	int[] nums = { 5, 23, 17, 2, 8, 20, 52, 31 };

	public Client() {

	}

	public void performSort() {
		sb.sort(nums);
	}

	public void setSortMethod(SortBehavior sorter) {
		sb = sorter;
		nums = new int[] { 5, 23, 17, 2, 8, 20, 52, 31 }; // resets the array to unsorted order
	}
}
