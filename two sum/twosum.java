import java.util.Arrays;
import java.util.HashMap;
class Main{
    public static int[] twoSum(int[] n, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=n.length;i++){
            int needed=target-n[i];
            if(map.containsKey(needed)){
                return new int[]{needed,n[i]};
                
            }
            map.put(i,n[i]);
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[]args){
        int[] n={2,3,4,5,6};
        int target=8;
        int[]result=twoSum(n,target);
        System.out.println(Arrays.toString(result));
    }
}
