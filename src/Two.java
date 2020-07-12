import java.util.Map;
import java.util.HashMap;
public class Two {
    public static void main ( String args[]){
        int nums[]=new int[]{2,7,11,15};
        int target =13;
        int[] res=twoSum(nums,target);
        System.out.println(res[0]+" "+res[1]);



    }public static int[]twoSum(int [] nums,int target){
        Map<Integer,Integer> mv=new HashMap();
        for(int i=0;i<nums.length;i++){
           int  delt=target-nums[i];
           if(mv.containsKey(delt)) {
               return new int[]{i, mv.get(delt)};
           }
         mv.put(nums[i],i);

        }return new int []{-1,-1};




    }
}
