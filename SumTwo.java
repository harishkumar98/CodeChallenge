import java.util.*;
class SumTwo {
    public int[] twoSum(int[] nums, int target) {
       
            Map<Integer, Integer> val = new HashMap<>();
            for(int i=0; i< nums.length; i++){
                int comp = target - nums[i];
                if(val.containsKey(comp)){
                    return new int[]{val.get(comp), i};
                }
                val.put(nums[i], i);
            }   
            throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String s[]){
        SumTwo s1 = new SumTwo();
        int [] x1 = {5,4,6,7};
        int [] res = s1.twoSum(x1, 11);
        System.out.println(Arrays.toString(res));
    }
}