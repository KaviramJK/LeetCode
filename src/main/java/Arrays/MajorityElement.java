package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
       int [] nums={2,2,1,1,1,2,2};
       majority(nums);
    }

    public static void majority(int [] nums){
        int target=nums.length/2;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }

        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>target){
                System.out.println(entry.getKey());
            }

        }


    }



}
