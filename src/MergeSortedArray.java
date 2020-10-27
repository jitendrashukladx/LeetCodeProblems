public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k=0;
        int nums3[] = new int[n+m];
        while(i < m && j < n){
            if(nums1[i] > nums2[j]) {
                nums3[k++] = nums2[j++];
            } else {
                nums3[k++] = nums1[i++];
            }
        }
        while(i < m) nums3[k++] = nums1[i++];
        while(j < n) nums3[k++] = nums2[j++];
        System.arraycopy(nums3,0,nums1,0,m+n);
    }
}
