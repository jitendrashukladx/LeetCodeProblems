class Solution {
public:
    int subarraySum(vector<int>& nums) {
        vector<pair<int, int>> queries;
        int ans = 0;

        //populate all the queries that needs to be calculated
        for(int i = 0; i < nums.size(); i++) {
            queries.push_back(make_pair(max(0,i - nums[i]), i));
        }

        //pre-calculate the prefix sum so that we can calculate sum for all the queries
        vector<int> prefixSum(nums.size() + 1, 0);
        for(int i = 0; i < nums.size(); i++) {
            prefixSum[i+1] = nums[i] + prefixSum[i];
        }
        
        //loop on the queries and then calculate the final sum;
        for(pair pq : queries) {
            ans += (prefixSum[pq.second + 1] - prefixSum[pq.first]);
        }

        return ans;
    }
};