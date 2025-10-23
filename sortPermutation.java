import java.util.*;
public class Solution{
    public int sortPermutation(int[]nums){
        boolean sorted=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                sorted=false;
                break;
            }
            
        }
        if(sorted)return 0;
        Integer k=null;
        for(int i=0;i<nums.length;++i){
            if(nums[i]!=i){
                if(k==null)k=nums[i];
                else k&=nums[i];
            }
        }
        return k==null?0:k;
        
    }
}
