/**
 * Created by lenovo on 2017/7/10.
 */
public class start {
    public int[] twoSum(int[] nums, int target) {
        int [] num = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    num[0]=i;
                    num[1]=j;
                    return num;
                }
            }
        }
        return num;
    }
    public static void main(String args[]){
        int c[]={3,2,4};
        start s = new start();
        System.out.print(s.twoSum(c,6)[0]);
        System.out.print(s.twoSum(c,6)[1]);
    }
}
