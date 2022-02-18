public class MergedSortedArray {
    public void shift(int i, int[] nums){
        for(int j = nums.length - 1; j > i; j--){
            nums[j] = nums[j - 1];
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        if (m != 0 && n != 0) {
            int last = nums1[m - 1];
            while (i < nums1.length && j < n) {
                if (i != 0 && nums1[i - 1] == last) {
                    break;
                }
                if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    shift(i, nums1);
                    nums1[i] = nums2[j];
                    i++;
                    j++;
                }
            }
        }
        if (j < n) {
            while (j < n) {
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
    }
}
