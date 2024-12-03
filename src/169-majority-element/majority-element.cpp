class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int, int> mpp;
        for(int i = 0; i < nums.size(); i++) {
            if(mpp.find(nums[i]) == mpp.end()) {
                mpp[nums[i]] = 1;
            } else {
                mpp[nums[i]]++;
            }
        }
        
        int ans = -1;
        int maxi = -1;
        for(auto& it : mpp) {
            if(it.second > maxi){
                ans = it.first;
                maxi = it.second;
            }
        }
        return ans;
    }
};