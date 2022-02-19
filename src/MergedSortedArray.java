public class MergedSortedArray {
    public void shift(int i, int[] nums, int m){
        for(int j = m; j > i; j--){
            nums[j] = nums[j - 1];
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                shift(i, nums1, m);
                nums1[i] = nums2[j];
                i++;
                j++;
                m++;
            } else if (nums1[i] == nums2[j]) {
                i++;
                shift(i, nums1, m);
                nums1[i] = nums2[j];
                i++;
                j++;
                m++;
            }
        }
        if (j < n) {
            for (int k = m; k < nums1.length; k++) {
                nums1[k] = nums2[j];
                j++;
            }
        }
    }
}
