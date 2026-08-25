class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> numbers;
        for (size_t i = 0; i < nums.size(); i++){
            for (size_t j = i + 1; j < nums.size(); j++){
                if (nums[i] + nums[j] == target){
                    numbers.push_back(i);
                    numbers.push_back(j);
                    return numbers;
                }
            }
        }
        return numbers;
    }
};