
/**
 * Created by lenovo on 2017/7/10.
 */
public class start {

    public static void main(String args[]){
        start s = new start();
        int[] nums = {1};
        int[] nu = {2,3,7};
        System.out.print(s.findMedianSortedArrays(nums,nu));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        if(nums1.length==0&& nums2.length==0){
            return 0.0;
        }else if(nums1.length==0){
            if(nums2.length%2==0) {
                median = (nums2[nums2.length/2]+nums2[nums2.length/2-1])/2.0;
            }else{
                median = nums2[nums2.length/2];
            }
        }else if(nums2.length==0){
            if(nums1.length%2==0) {
                median = (nums1[nums1.length/2]+nums1[nums1.length/2-1])/2.0;
            }else{
                median = nums1[nums1.length/2];
            }
        }else{
            int i=0,k=0;
            int flag = 2;
            int total = nums1.length+nums2.length;
            int medium = total/2+1;
            int[] index = new int[2];
            while(i+k+1<=medium) {
                if (k < nums2.length && i < nums1.length) {
                    if (nums1[i] < nums2[k]) {
                        if (flag == 0) {
                            index[0] = index[1];
                            index[1] = nums1[i];
                            i++;
                        } else {
                            if (flag == 1) {
                                index[1] = nums1[i];
                                i++;
                                flag--;
                            } else {
                                index[0] = nums1[i];
                                i++;
                                flag--;
                            }
                        }
                    } else {
                        if (flag == 0) {
                            index[0] = index[1];
                            index[1] = nums2[k];
                            k++;
                        } else {
                            if (flag == 1) {
                                index[1] = nums2[k];
                                k++;
                                flag--;
                            } else {
                                index[0] = nums2[k];
                                k++;
                                flag--;
                            }
                        }
                    }
                }else if(i==nums1.length){
                    if(flag==0) {
                        index[0] = index[1];
                        index[1] = nums2[k];
                        k++;
                    }else if(flag==1){
                        index[1] = nums2[k];
                        k++;
                        flag--;
                    }else{
                        index[0] = nums2[k];
                        k++;
                        flag--;
                    }
                }else {
                    if (flag==0) {
                        index[0] = index[1];
                        index[1] = nums1[i];
                        i++;
                    }else if(flag==1){
                        index[1]=nums1[i];
                        i++;
                        flag--;
                    }else{
                        index[0]=nums1[i];
                        i++;
                        flag--;
                    }
                }
            }
            if(total%2==1){
                median = index[1];
            }else {
                System.out.println(index[0]);
                System.out.println(index[1]);
                median = (index[0] + index[1]) / 2.0;
            }
        }
        return median;
    }
}
