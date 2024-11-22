class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size();
        int n2 = nums2.size();
        int n = n1 + n2;

        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int cnt = 0;
        int ind1e1 = -1, ind2e1 = -1;
        int i = 0, j = 0;
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                if(cnt == ind1) ind1e1 = nums1[i];
                if(cnt == ind2) ind2e1 = nums1[i];
                cnt++;
                i++;
            } else {
                if(cnt == ind1) ind1e1 = nums2[j];
                if(cnt == ind2) ind2e1 = nums2[j];
                cnt++;
                j++;
            }
        }
        while(i < n1) {
            if(cnt == ind1) ind1e1 = nums1[i];
            if(cnt == ind2) ind2e1 = nums1[i];
            cnt++;
            i++;
        }
        while(j < n2) {
            if(cnt == ind1) ind1e1 = nums2[j];
            if(cnt == ind2) ind2e1 = nums2[j];
            cnt++;
            j++;
        }
        
        if(n % 2 == 1) {
            return (double) ind2e1;
        }
        return (double)((double)(ind1e1 + ind2e1)) / 2.0;
    }
};