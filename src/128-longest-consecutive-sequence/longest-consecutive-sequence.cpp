class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> hash(nums.begin(), nums.end());

        int count = 0;
        for(int n : hash) {
            if(hash.find(n-1) == hash.end()) {
                int length = 1;
                while(hash.find(n+length) != hash.end())
                    length++;
                count = max(count, length);
            }
        }
        return count;
    }
};