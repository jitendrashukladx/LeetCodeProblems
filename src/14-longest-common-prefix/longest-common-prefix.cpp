class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans = "";
        bool found = true;
        for(int i = 0 ; i < strs[0].length(); i++) {
            char ch = strs[0][i];
            for(int j = 1; j < strs.size(); j++) {
                if(strs[j].length() < i || strs[j][i] != ch) {
                    found = false;
                    break;
                }
            }
            if(found) {
                ans.push_back(ch);
            } else {
                break;
            }
        }
        return ans;
    }
};