#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        int arr[2];
        for (int i = 0; i < (int)nums.size(); i++)
        {
            for (int j = i+1; j < (int)nums.size(); j++)
            {
                if (nums.at(i) + nums.at(j) == target)
                {

                    arr[0] = i;
                    arr[1] = j;
                    goto out;
                }
            }
        }
    out:
        vector<int> v(arr, arr + 2);
        return v;
    }
};
