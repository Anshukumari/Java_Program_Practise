import java.util.HashMap;
import java.util.Map;

public class TwoSumOneHash {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] num={11,7,2,15};
        TwoSum ts = new TwoSum();
        int[] aarr = ts.twoSum(num,9);
        for(int i=0;i<aarr.length;i++)
            System.out.println(aarr[i]);
    }
}
