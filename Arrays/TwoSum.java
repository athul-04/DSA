import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // First Way is to do with two for loops..

        //Second is this method..

        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)mp.put(nums[i],i);

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                if(target-nums[i]==nums[i] && mp.get(nums[i])==i)continue;
                return new int[]{i,mp.get(target-nums[i])};
            }
        }


        //Third is this method...
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(mp.containsKey(target-nums[i])){
                return new int[]{i,mp.get(target-nums[i])};
            }
            mp.put(nums[i],i);
        }
        return new int[]{0,0};

    }
}