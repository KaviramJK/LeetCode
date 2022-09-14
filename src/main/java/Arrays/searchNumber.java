package Arrays;

import java.util.HashMap;
import java.util.Map;

public class searchNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,2,1};
        Map<Integer,Integer> map = new HashMap<>();

       for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int res=0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                 res=entry.getKey();
            }

        }
        System.out.println(res);
        //***********XOR Solution*************//
//        int res = 0;
//        for(int num: nums){
//            res^=num;
//        }
//        System.out.println(res);
    }
}

