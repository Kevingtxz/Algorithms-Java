//1. Two Sum
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] TwoSumMethod(int[] nums, int target) {
        Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(mymap.containsKey(target-nums[i])){
                return new int[] {mymap.get(target-nums[i]), i};
            }
            mymap.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = TwoSumMethod(nums, target);
        System.out.println("["+result[0]+"]["+result[1]+"]");
    }
}
