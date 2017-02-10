/**
 * Created by Cals on 2017/2/11.
 */

import java.util.Arrays;

public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int totalTime = 0;
        if(n==1){
            for(int i=0;i<customers.length;i++){
                totalTime = totalTime + customers[i];
            }
        }else{
            int i=0;
            while(i<customers.length){
                int[] times;
                if(i+n-1 > customers.length){
                    times = Arrays.copyOfRange(customers,i,customers.length-1);
                }else{
                    times = Arrays.copyOfRange(customers,i,i+n-1);
                }
                int max = times[0];
                for (int time:times) {
                    if(max < time){
                        max = time;
                    }
                }
                i=i+n;
                totalTime = totalTime + max;
            }
        }
        return totalTime;
    }
}