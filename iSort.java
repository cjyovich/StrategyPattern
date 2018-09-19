
public class iSort implements SortBehavior {
	public void sort(int[] nums) {
		//insertion sort algorithm
		//reference: https://www.geeksforgeeks.org/insertion-sort/
		int n = nums.length;
		for (int i=1; i<n; ++i)
        {
            int key = nums[i];
            int j = i-1;
 
            while (j>=0 && nums[j] > key)
            {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = key;
        }
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
