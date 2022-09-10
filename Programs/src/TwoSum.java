import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==(target-nums[i]))
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] num={3,3};
        TwoSum ts = new TwoSum();
        int[] aarr = ts.twoSum(num,6);
        for(int i=0;i<aarr.length;i++)
        System.out.println(aarr[i]);
    }
}
