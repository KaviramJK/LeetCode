package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInSortedArray {


    public static void main(String[] args) {
        int[] x={0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicate(x));
//       System.out.println(removeDuplicates(x));
        System.out.println(removeElement());
    }

    public static int removeDuplicate(int[] x){
        Set<Integer> removed=new HashSet();

        for(int i=0;i<x.length;i++){
            removed.add(x[i]);
        }
        System.out.println(removed);
      return removed.size();
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0 ;
        for(int j = 1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i] = nums[j]; //1,1,2
            }
        }
        return i+1;
    }

    public static int removeElement(){
        int[] nums={3,2,2,3};
        int val=3;
        int i=0;
        for(int j=0;j<nums.length;j++){ //3,2,2,3
          if(nums[j]==val){ //
              continue;
          }
          nums[i]=nums[j];
          i++;

        }
        return i;
    }


}
