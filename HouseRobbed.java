package Recursion;

import static java.util.Collections.max;

public class HouseRobbed {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(robbed(nums));
    }
    public static int robbed(int[] nums) {
        return robbed(nums, 0);
    }
    public static int robbed(int[] nums, int index){
        if(index>= nums.length){
            return 0;
        }
        int include= nums[index] + robbed(nums, index+2);
        int exclude= robbed(nums, index+1);

        return Math.max(include, exclude);
    }

}
