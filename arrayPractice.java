import java.util.*;
// import java.util.Arrays;
// import java.util.Collections;
//import java.math.*;

public class arrayPractice {

                                                
    public static int trappedWater(int [] height){ 
        int n = height.length;
        if(n == 0){
            return 0;
        }
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int trappedWater = 0;
        for(int i = 0; i < n ; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    

    //Q1-------------------------------------------------------
    public static boolean countElement(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
    //Q2------------------Shorted array----------------------------
    //APPROACH 1------Linear search
    public static int  findTarget(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    //APPROACH 2------Binary search 
    public static int FindTarget(int [] nums, int target ){
        int st = 0; 
        int end = nums.length-1;
        for(int i = 0; i < nums.length; i++){
            int mid = st+(end - st)/2;
            if(nums[mid] < target){
                st = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
           return -1;
    }
    // Q2 A---------------Shorted rotated  array --------------------
    public static int target(int [] nums, int tar){
        int 
    }
    //Q3----------------------------------------------------
    public static int buySellStock(int[] prices){
        int maxProfit = Integer.MIN_VALUE; int bestBuy = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > bestBuy){
                maxProfit = Math.max(prices[i]-bestBuy, maxProfit);
            }
            bestBuy = Math.min(prices[i], bestBuy);
        }
        return maxProfit;
    }
    //Q4---------------------------------------------------
    //APPROACH 1
    public static int TrappedWater(int[] height){                       
        int n = height.length;
        if(n == 0){
            return 0;
        }
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int trappedWater = 0;
        for(int i = 0; i < n ; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    //APPROACH 2------------------------
    public static int tapped(int []height){
        int n = height.length;
        int res = 0; 
        int l = 0, r= n-1;
        int rMax= height[r], lMax = height[l];
        while(l < r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            }else{
                r--;
                rMax = Math.max(rMax,height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) { 
        //int height[] ={4, 2, 0, 3, 2, 1};
        // TRAPPED WATER........>>>
        //System.out.println(trappedWater(height));

        
        /*Q1 
        int nums[] ={ 1, 2, 3, 1};
        System.out.println(countElement(nums));

        Q2
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;
        System.out.println(FindTarget(nums, target));
        
        Q3
        int[] prices = {7, 1, 3, 5, 6, 4};
        System.out.println(buySellStock(prices));
        
        Q4
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //System.out.println(TrappedWater(height));
        //System.out.println(tapped(height));
        */


    }
}
