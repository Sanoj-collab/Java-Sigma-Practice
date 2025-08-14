import java.util.*;
public class greedyAlgo {
    static List<Integer> minPartition(int N)
    {
        
        ArrayList<Integer> currency = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        currency.add(2000);
        currency.add(500);
        currency.add(100);
        currency.add(50);
        currency.add(20);
        currency.add(10);
        currency.add(5);
        currency.add(2);
        currency.add(1);
        
        for(int ele: currency){
            while(N >= ele){
                ans.add(ele);
                N -= ele;
            }
        }
        return ans;
    }
    // Aq 1-----------------------
    public static int balancedPartionString(String str){
        int l = 0, r= 0; 
        int ans = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'L'){
                l++;
            }else if(str.charAt(i) == 'R'){
                r++;
            }  
            if(l == r){
                ans++;
            }
        }
        
        return ans;
    }

    // AQ 2------------------
    public static int kthOdd(int[] range, int K) {
 
        // Base Case
        if (K <= 0)
            return 0;
 
        int L = range[0];
        int R = range[1];
 
        if ((R & 1) > 0) {
 
            // Calculate count of odd
            // numbers within the range
            int Count = (int) Math.ceil((R - L + 1) / 2);
 
            // if k > range then kth largest
            // odd number is not in the range
            if (K > Count)
                return 0;
 
            else
                return (R - 2 * K + 2);
        } else {
 
            // Calculate count of odd
            // numbers within the range
            int Count = (R - L + 1) / 2;
 
            // If k > range then kth largest
            // odd number is not in this range
            if (K > Count)
                return 0;
 
            else
                return (R - 2 * K + 1);
        }
    }
    
    public static void main(String[] args) {
        // Activity selection problem
        // int st[] = {1, 3, 0, 5, 8, 5};
        // int end[] = {2, 4, 6, 7, 9, 9};
        // int maxAct = 0;
        // ArrayList<Integer> ans = new ArrayList<>();
        // maxAct = 1;
        // ans.add(0);
        // int lastEnd = end[0];
        // for(int i = 1; i < end.length; i++){
        //     if(st[i] >= lastEnd){
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }
        // System.out.println("Max activities: " + maxAct);
        // for(int i = 0; i < ans.size(); i++){
        //     System.out.print("A"+ans.get(i)+" ");
        // }
        // System.out.println();

        // Fractional Knapsack problem----------------------
        // int val[] = {60, 100, 120};
        // int wt[] = {10, 20, 30};
        // int W = 50;
        // double ratio[][] = new double[val.length][2];
        // for(int i = 0; i < val.length; i++){
        //     ratio[i][0] = i;
        //     ratio[i][1] = val[i]/(double)wt[i];
        // }
        // Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        // int capacity = W;
        // int finalVAlue = 0;
        // for(int i = ratio.length-1; i >= 0; i--){
        //     int idx = (int)ratio[i][0];
        //     if(capacity >= wt[idx]){
        //         capacity -= wt[idx];
        //         finalVAlue += val[idx];
        //     } else {
        //         finalVAlue += (capacity * ratio[i][1]);
        //         break;
        //     }
        // }
        // System.out.println("Max value in knapsack: " + finalVAlue);

        // Minimum absolute difference ------------------------

        // int A[] ={1, 2, 3};
        // int B[] = {2, 1, 3};

        // Arrays.sort(A);
        // Arrays.sort(B);
        // int minDiff = 0;
        // for(int i = 0; i < A.length; i++){
        //     minDiff += Math.abs(A[i] - B[i]);
        // }
        // System.out.println("Minimum absolute difference: " + minDiff);

        //Max length chain of pairs ----------------------
        // int pairs[][] = {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}}; 
        // Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));
        // int maxChainLength = 1;
        // int lastEnd = pairs[0][1];
        // for(int i = 1; i < pairs.length; i++){
        //     if(pairs[i][0] > lastEnd){
        //         maxChainLength++;
        //         lastEnd = pairs[i][1];
        //     }
        // }
        // System.out.println("Max length of chain of pairs: " + maxChainLength);

        // Indian coin ----------------------------
        // Integer coins[]= { 1, 2, 5, 10, 20, 50, 100, 500, 2000};
        // Arrays.sort(coins, Comparator.reverseOrder());
        // int count = 0;
        // int amount = 590;
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < coins.length; i++){
        //     while(coins[i] <= amount){
        //         count++;
        //         ans.add(coins[i]);
        //         amount -= coins[i];
        //     }
        // }
        // System.out.println(" Minimum Number of coins: " + count);

        // Function method of coin problem ..------
        // int N = 43;
        // System.out.println("Minimum number of coins: " + minPartition(N));

        // AQ 1---------------------
        String str = "LRRRRLLRLLRL";

        int ans =balancedPartionString(str);
        System.out.println("Max balanced partition: " + ans);

        // AQ 2--------------------
        int range[]={-3,3};
        int k = 1;
        System.out.println("Kth odd number: " + kthOdd(range, k));

        // AQ3---------------------
        
    }
}
