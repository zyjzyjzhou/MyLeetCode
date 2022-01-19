public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, p = 0;
        int[] sorted = new int[m+n];
        while (j < n && i<m) {
            if (nums1[i] < nums2[j]) {
                sorted[p] = nums1[i];
                i++;
            } else {
                sorted[p] = nums2[j];
                j++;
            }
            p++;
        }
       if(j<n){
           for(;p<m+n&&j<n;p++,j++){
               sorted[p]=nums2[j];
           }
       }else if(i<m){
           for(;p<m+n&&i<m;p++,i++){
               sorted[p]=nums1[i];
           }
       }
        for (int k = 0; k < m+n ; ++k) {
            nums1[k] = sorted[k];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        Solution88 solution88 = new Solution88();
        solution88.merge(nums1, 1, nums2, 1);
    }
}
